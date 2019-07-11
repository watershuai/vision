package com.lincoln;

import com.alibaba.fastjson.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spider {
    private static Logger logger = LoggerFactory.getLogger(Spider.class);
    //private static ExecutorService executorService = Executors.newFixedThreadPool(3);
   private static String saomiao="";
    public static void printer(String str) {
        logger.info(str);
    }

    public static String request(String url, String method, String body, String token) {
        try {
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.addRequestProperty("Content-Type", "application/json");
            if (token != null && !"".equals(token)) { /*  36 */
                conn.addRequestProperty("Authorization", "t1A8wdKPklfMtgkneGIayJ5SkLujz5tj");
                conn.addRequestProperty("x-token", token);
            }
            conn.setRequestMethod(method);
            if ("POST".equals(method)) {
                conn.setDoInput(true);
                conn.setDoOutput(true);
                OutputStream op = conn.getOutputStream();
                op.write(body.getBytes());
            }
            if (conn.getResponseCode() == 200) {
                InputStream in = conn.getInputStream();
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) != -1) {
                    result.write(buffer, 0, length);
                }
                in.close();
                String res = result.toString();
                printer(res);
                return res;
            }
            return null;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }

    public static String request(String url, Connection.Method method, String body, String token) {
        try {
            Map<String, String> headers = new HashMap<String, String>();
            headers.put("Content-Type", "application/json");
            if (token != null && !"".equals(token)) {
                headers.put("Authorization", "geEj2jAsH7HMxt14uYDLv0PWR9BuolNq");
                headers.put("x-token", token);
            }
            Connection connection = Jsoup.connect(url).ignoreContentType(true).method(method).headers(headers);
            if (body != null && !"".equals(body)) connection.requestBody(body).execute();
            Connection.Response response = connection.execute();
            if (response.statusCode() == 200) {
                String res = response.body();
                printer(res);
                return res;
            }
            return null;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }



    public static String login(String username, String password, String code,String threadMs) {
        try {
            saomiao=threadMs;
            Map<String, String> body = new HashMap<String, String>();
            body.put("act", username);
            body.put("pwd", password);
            body.put("code", code);
            body.put("codeType", "google");
            String content = request("https://tryd.tinywin.net/api/exchg/system/login", Connection.Method.POST, JSONObject.toJSONString(body), null);
            if (content != null) {
                String token = JSONObject.parseObject(content).getJSONObject("msg").getString("token");
                printer("token:" + token);
                return token;
            }
            return null;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }

    public static String getPicture(String result) {
        String object = JSONObject.parseObject(result).getString("pic_str");
        return object;
    }

    public static List<Order> queryOrders(String token) throws LoginException {
        return queryOrders(token, null);
    }


    public static List<Order> queryOrders(String token, String captcha) throws LoginException {
        try {
            String url = "https://tryd.tinywin.net/api/exchg/order/queryPendingOrders?page=1&count=10" + ((captcha != null && !"".equals(captcha)) ? ("&captcha=" + captcha) : "");
            String content = request(url, Connection.Method.GET, null, token);
            Integer code = JSONObject.parseObject(content).getInteger("code");
            if (code == null || code.intValue() != 200) {
                if (code != null && code.intValue() == 2002) {
                    throw new LoginException("身份已过期，请重新登陆");
                }
                printer(JSONObject.parseObject(content).getString("err"));
                return null;
            }
            JSONObject json = JSONObject.parseObject(content);
            String contentCaptcha = json.getString("captcha");
            String vCode = "";
            if (StringUtils.isNotEmpty(contentCaptcha)) {
                picture.read3(contentCaptcha);
                vCode = ChaoJiYing.PostPic_base64("rbr123456", "123456zxc", "900318", "1004", "0", ChaoJiYing.encodeToString(picture.PIC_NAME));
                String str = getPicture(vCode);
                //Utils.executorUtils("识别出图片验证码为:" +str);
                AccountContext.juyingFrame.printLog("识别出图片验证码为:" +str);
                logger.info("图片验证码为:" + str);
                return queryOrders(token, str);
            }
            int totalCount = JSONObject.parseObject(content).getJSONObject("msg").getIntValue("totalCount");
            int lockedOrderNums = JSONObject.parseObject(content).getJSONObject("msg").getIntValue("lockedOrderNums");
            if (lockedOrderNums > 0) {
                return new ArrayList();
            }
            if (content != null && totalCount > 0) {
                printer("找到" + totalCount + "个订单");
                List<Order> res = JSONObject.parseObject(content).getJSONObject("msg").getJSONArray("data").toJavaList(Order.class);
                return (res.size() == 0) ? null : res;
            }
            logger.info("saomiao PINLU:" + saomiao+"ms");
            if (StringUtils.isNotEmpty(saomiao)){
                Thread.sleep(Integer.valueOf(saomiao));
            }
            return null;
        } catch (LoginException e1) {
            throw e1;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }

    public static boolean lockOrder(String token, String oid) {
        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("oid", oid);
            params.put("status", "pending");
            String content = request("https://tryd.tinywin.net/api/exchg/order/lockOrder", Connection.Method.POST, JSONObject.toJSONString(params), token);
            if (content != null) {
                AccountContext.juyingFrame.printLog("锁单结果:"+content);
                boolean res = StringUtils.contains(content,"已存在锁单订单") || JSONObject.parseObject(content).getIntValue("code") == 200 || StringUtils.contains(content,"锁单成功");
                printer("锁定订单:" + res);
                return res;
            }
            return false;
        } catch (Exception e) {
            logger.error("{}", e);
            return false;
        }
    }

    public static String query(String token) {
        List<Order> orders = null;
        while (orders == null) try {
            orders = queryOrders(token);
        } catch (LoginException e) {
            e.printStackTrace();
        }
        if (orders.size() == 0) {
            printer("已经有锁的订单");
            return "";
        }
        return  orders.get(0).getOid();
    }

    public static Order queryLockedOrder(String token) {
        try {
            String content = request("https://tryd.tinywin.net/api/exchg/order/queryLockedOrder?page=1&count=10", Connection.Method.GET, null, token);
            int totalCount = JSONObject.parseObject(content).getJSONObject("msg").getIntValue("totalCount");
            if (content != null && totalCount > 0) {
                printer("找到" + totalCount + "个订单");
                List<Order> res = JSONObject.parseObject(content).getJSONObject("msg").getJSONArray("data").toJavaList(Order.class);
                return (res.size() == 0) ? null : res.get(0);
            }
            return null;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }

    public static boolean complete(String token, String oid) {
        try {
            Alipay alipay = queryAlipays(token);
            Map<String, String> params = new HashMap<String, String>();
            params.put("oid", oid);
            if (AccountContext.juyingFrame.radioButton1.isSelected()) {
                params.put("alipayNo", Utils.random07(7));
                params.put("payAlipayAct", alipay.getAccount());
                params.put("payName", alipay.getName());
                params.put("payType", "alipay");
            }else {
                params.put("cardNo", Utils.random07(7));
                params.put("payCardNo", alipay.getAccount());
                params.put("payName", alipay.getName());
                params.put("payType", "bankcard");
            }
            String content = request("https://tryd.tinywin.net/api/exchg/order/confirm", Connection.Method.POST, JSONObject.toJSONString(params), token);
            if (content != null && JSONObject.parseObject(content).getIntValue("code") == 200) {
                return true;
            }
            return false;
        } catch (Exception e) {
            logger.error("{}", e);
            return false;
        }
    }

    public static Alipay queryAlipays(String token) {
        try {
            String content="";
            if (AccountContext.juyingFrame.radioButton1.isSelected()) {
                 content= request("https://tryd.tinywin.net/api/exchg/alipay/queryAlipays?page=1&count=100", Connection.Method.GET, null, token);
            }else {
                content=request("https://tryd.tinywin.net/api/exchg/bankcard/queryBankcard?page=1&count=100", Connection.Method.GET, null, token);
            }
            int totalCount = JSONObject.parseObject(content).getJSONObject("msg").getIntValue("totalCount");
            if (content != null && totalCount > 0) {
                printer("找到" + totalCount + "个订单");
                List<Alipay> res = JSONObject.parseObject(content).getJSONObject("msg").getJSONArray("data").toJavaList(Alipay.class);
                return (res.size() == 0) ? null :  res.get(0);
            }
            return null;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }

    public static boolean cancelOrder(String token, String oid, String mark) {
        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("oid", oid);
            params.put("mark", mark);
            String content = request("https://tryd.tinywin.net/api/exchg/order/refuse", Connection.Method.POST, JSONObject.toJSONString(params), token);
            if (content != null && JSONObject.parseObject(content).getIntValue("code") == 200 || StringUtils.contains(content,"拒绝成功")) {
                return true;
            }
            return false;
        } catch (Exception e) {
            logger.error("{}", e);
            return false;
        }
    }

    public static String queryUserInfo(String token,String threadMs) {
        try {
            saomiao=threadMs;
            String content = request("https://tryd.tinywin.net/api/exchg/user/queryLoginUser", Connection.Method.GET, null, token);
            Integer code = JSONObject.parseObject(content).getInteger("code");
            if (content != null && code != null && code.intValue() == 200) {
                return content.substring("{\"code\":200,\"msg\":".length(), content.length() - 1);
            }
            return null;
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        }
    }

    public static void main(String[] args) {
        String token = login("duiyhk065", "123456zxcasd", "767498","500");
        boolean flag = false;
        while (!flag) {
            String oid = query(token);
            if (oid != null && "".equals(oid)) break;
            flag = lockOrder(token, oid);
        }
        /*String content="{\"code\":200,\"msg\":{\"totalCount\":1,\"data\":[{\"status\":\"pending\",\"type\":\"bankcard\",\"delStatus\":false,\"tgStatus\":false,\"warnStatus\":\"normal\",\"refundNotifyStatus\":\"undo\",\"notifyStatus\":\"undo\",\"_id\":\"5d1aeb9aeaaa7649f2f1cbb1\",\"oid\":\"20190702132858059786245\",\"mercId\":\"10023\",\"tradeNo\":\"5d1aeb99cd363f6ff56e3a3b\",\"money\":0,\"receiptName\":\"王建浦\",\"receCardNo\":\"6217000010082661037\",\"notifyUrl\":\"http://bill.yunleopard.com:8081/3rd/w/jinyubank\",\"playerId\":\"28740135\",\"createTime\":\"2019-07-02T05:28:58.060Z\",\"updateTime\":\"2019-07-02T05:28:58.060Z\"}],\"lockedOrderNums\":0}}";
        *//*boolean res = StringUtils.contains(content,"已存在锁单订单") || JSONObject.parseObject(content).getIntValue("code") == 200;
        System.out.print(res);*//*
        List<Order> res = JSONObject.parseObject(content).getJSONObject("msg").getJSONArray("data").toJavaList(Order.class);
        System.out.print(res);*/
    }
}