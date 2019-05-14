package com.vision.student.action;

import com.vision.student.bean.CommonMessage;
import com.vision.student.bean.User;
import com.vision.student.service.UserService;
import com.vision.student.utils.ResponseBean;
import com.vision.student.utils.RundomUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import java.net.URLEncoder;
import java.util.*;

@Controller
@RequestMapping(value = "/file")
@Slf4j
public class FileController {
    @Autowired
    private UserService userService;
    private static final String FILE_PATH=File.separator+"root"+File.separator+"vision"+File.separator+"file"+File.separator+"template.xlsx";


    //批量新增，文件解析
    @RequestMapping("/upload")
    @ResponseBody
    public ResponseBean<String> fileUpload(HttpServletRequest request) throws IOException {
        try {
            //PrintWriter out=response.getWriter();
            User user = (User) request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            Workbook wb = getWorkbookFromRequest(request);
            List<List<Object>> listob = RundomUtils.batchExportJiJin(wb);
            excelInsert(listob,user.getUserName());
            return new ResponseBean<String>(200,"上传成功");
        }catch (Exception e){
            log.info("文件上传出现异常",e);
            return new ResponseBean<String>(203,"文件上传出现异常");
        }
    }

    public Workbook getWorkbookFromRequest(HttpServletRequest request) throws IOException{
        InputStream is=null;
        MultipartFile multipartFile=null;

            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            Iterator<String> iterator = multiRequest.getFileNames();
            while (iterator.hasNext()) {
                multipartFile= multiRequest.getFile(iterator.next());
                if(multipartFile !=null){
                    is=new ByteArrayInputStream(multipartFile.getBytes());
                }
            }
        log.info("文件上传,获取到的文件名为:"+multipartFile.getOriginalFilename());
        Workbook wb=workbookType(is,multipartFile.getOriginalFilename());
        return wb;
    }
    public Workbook workbookType(InputStream inStr,String fileName) throws IOException{
        Workbook wb = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        /*if ("xlsx".equals(fileType)){
            throw new IllegalArgumentException("请上传后缀为xlsx版本的2007后的excel");
        }*/
        wb = new XSSFWorkbook(inStr);  //2007+
        if (wb == null){
            log.info("文件上传,获取工作薄为空");
        }
        return wb;
    }

    private void excelInsert(List<List<Object>> listob,String userName){
        for (int i = 0; i < listob.size(); i++){
            List<Object> lo = listob.get(i);
            lo.removeIf(Objects::isNull);
            CommonMessage common=new CommonMessage();
            common.setStudentName(String.valueOf(lo.get(0)));
            common.setPhone(String.valueOf(lo.get(1)));
            common.setGender(String.valueOf(lo.get(2)));
            common.setParentPhone(String.valueOf(lo.get(3)));
            common.setDateBirth(String.valueOf(lo.get(4)));

            common.setHeigh(String.valueOf(lo.get(5)));
            common.setWeight(String.valueOf(lo.get(6)));
            common.setProvince(String.valueOf(lo.get(7)));
            common.setCity(String.valueOf(lo.get(8)));

            common.setCounty(String.valueOf(lo.get(9)));
            common.setSchool(String.valueOf(lo.get(10)));
            common.setBu(String.valueOf(lo.get(11)));
            common.setGrade(String.valueOf(lo.get(12)));
            common.setClassd(String.valueOf(lo.get(13)));
            common.setRowRow(String.valueOf(lo.get(14)));
            common.setFindPoorTime(String.valueOf(lo.get(15)));
            common.setWorkTime(String.valueOf(lo.get(16)));
            common.setSleepTime(String.valueOf(lo.get(17)));
            common.setWatchTvTime(String.valueOf(lo.get(18)));
            common.setComputerTime(String.valueOf(lo.get(19)));
            common.setPhysicalExercise(String.valueOf(lo.get(20)));
            common.setPartialEclipse(String.valueOf(lo.get(21)));
            common.setInheritance(String.valueOf(lo.get(22)));
            common.setEyeInjury(String.valueOf(lo.get(23)));
            common.setPrematureDelivery(String.valueOf(lo.get(24)));

            common.setCheckTime(String.valueOf(lo.get(25)));
            common.setCheckDoctor(String.valueOf(lo.get(26)));
            common.setLeftVisionType(String.valueOf(lo.get(27)));
            common.setLeftNakedEye(String.valueOf(lo.get(28)));
            common.setLeftdaijingEye(String.valueOf(lo.get(29)));
            common.setLeftSanTongYanGuangQiu(String.valueOf(lo.get(30)));
            common.setLeftSanTongYanGuangZhu(String.valueOf(lo.get(31)));
            common.setLeftSanTongYanGuangZhou(String.valueOf(lo.get(32)));
            common.setLeftZhuJueYanGuangQiu(String.valueOf(lo.get(33)));
            common.setLeftZhuJueYanGuangZhu(String.valueOf(lo.get(34)));
            common.setLeftZhuJueYanGuangZhou(String.valueOf(lo.get(35)));
            common.setLeftYanBuCheckJie(String.valueOf(lo.get(36)));
            common.setLeftYanBuCheckJiao(String.valueOf(lo.get(37)));
            common.setLeftEyeCheckDi(String.valueOf(lo.get(38)));
            common.setLeftEyeCheckXian(String.valueOf(lo.get(39)));
            common.setLeftEyeCheckYin(String.valueOf(lo.get(40)));
            common.setLeftEyeCheckOther(String.valueOf(lo.get(41)));

            common.setRightVisionType(String.valueOf(lo.get(42)));
            common.setRightNakedEye(String.valueOf(lo.get(43)));
            common.setRightdaijingEye(String.valueOf(lo.get(44)));
            common.setRightSanTongYanGuangQiu(String.valueOf(lo.get(45)));
            common.setRightSanTongYanGuangZhu(String.valueOf(lo.get(46)));
            common.setRightSanTongYanGuangZhou(String.valueOf(lo.get(47)));
            common.setRightZhuJueYanGuangQiu(String.valueOf(lo.get(48)));
            common.setRightZhuJueYanGuangZhu(String.valueOf(lo.get(49)));
            common.setRightZhuJueYanGuangZhou(String.valueOf(lo.get(50)));
            common.setRightYanBuCheckJie(String.valueOf(lo.get(51)));
            common.setRightYanBuCheckJiao(String.valueOf(lo.get(52)));
            common.setRightEyeCheckDi(String.valueOf(lo.get(53)));
            common.setRightEyeCheckXian(String.valueOf(lo.get(54)));
            common.setRightEyeCheckYin(String.valueOf(lo.get(55)));
            common.setRightEyeCheckOther(String.valueOf(lo.get(56)));
            common.setCreatTime(RundomUtils.getNowTime());
            common.setCheckDoctorPhone(userName);
            userService.baseInsert(common);
        }

    }


    @GetMapping("/exportVehicleInfo")
    public void exportVehicleInfo(HttpServletRequest req, HttpServletResponse resp) {
        DataInputStream in = null;
        OutputStream out = null;
        try{
            resp.reset();// 清空输出流
            log.info("开始下载模板");
            String resultFileName = "template.xlsx";
            resultFileName = URLEncoder.encode(resultFileName,"UTF-8");
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("Content-disposition", "attachment; filename=" + resultFileName);// 设定输出文件头
            resp.setContentType("application/msexcel");// 定义输出类型
            //String downloadPath="D:/template.xlsx";
            File file=new File(FILE_PATH);
            if (!file.exists()){
                log.info("下载模板，文件为空");
            }
            //输入流：本地文件路径
            in = new DataInputStream(
                    new FileInputStream(file));
            //输出流
            out = resp.getOutputStream();
            //输出文件
            int bytes = 0;
            byte[] bufferOut = new byte[1024];
            while ((bytes = in.read(bufferOut)) != -1) {
                out.write(bufferOut, 0, bytes);
            }
        } catch(Exception e){
            e.printStackTrace();
            resp.reset();
            log.info("下载模板发生异常1"+e);
            try {

                OutputStreamWriter writer = new OutputStreamWriter(resp.getOutputStream(), "UTF-8");
                String data = "<script language='javascript'>alert(\"\\u64cd\\u4f5c\\u5f02\\u5e38\\uff01\");</script>";
                writer.write(data);
                writer.close();
            } catch (IOException e1) {
                log.info("下载模板发生异常2"+e1);
                e1.printStackTrace();
            }
        }finally {
            if(null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }







}
