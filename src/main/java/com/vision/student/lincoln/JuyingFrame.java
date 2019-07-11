package com.lincoln;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

import org.apache.commons.lang.StringUtils;

public class JuyingFrame extends JFrame implements Runnable {
    public String strPic = "";

    public JuyingFrame(String strPic) {
        this.strPic = strPic;
    }

    private JButton jButton1;
    private JButton jButton54;
    private JButton jButton2;
    public JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel66;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel77;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel50;
    private JLabel label51;
    private JLabel label52;
    private JPanel jPanel9;
    private JLabel label1;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    public JLabel label13;
    private JLabel label14;
    public JLabel label15;
    private JLabel label16;
    public JLabel label17;
    private JLabel label18;
    public JLabel label19;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label99;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextArea textArea1;
    private JScrollPane scroll;
    private JTextField textField1;
    private JTextField textField66;
    private JTextField textField2;
    private JTextField textField53;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    public JRadioButton radioButton1;
    public JRadioButton radioButton2;
    public ButtonGroup bg;

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jPanel4 = new JPanel();
        this.jPanel77 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel66 = new JLabel();
        this.textField1 = new JTextField(9);
        this.textField66 = new JTextField(4);
        this.jPanel5 = new JPanel();
        this.jLabel2 = new JLabel();
        this.textField2 = new JTextField(9);
        this.textField53 = new JTextField(9);
        this.jPanel6 = new JPanel();
        this.jLabel3 = new JLabel();
        this.textField3 = new JTextField();
        this.jPanel7 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton54 = new JButton();
        this.jButton2 = new JButton();
        this.jPanel8 = new JPanel();
        this.jPanel50 = new JPanel();
        this.label51 = new JLabel();
        this.label52 = new JLabel();
        this.label1 = new JLabel();
        this.label2 = new JLabel();
        this.label3 = new JLabel();
        this.label4 = new JLabel();
        this.label5 = new JLabel();
        this.label99 = new JLabel();
        this.label6 = new JLabel();
        this.jButton3 = new JButton();
        this.jPanel9 = new JPanel();
        this.jPanel10 = new JPanel();
        this.jPanel12 = new JPanel();
        this.label7 = new JLabel();
        this.textField4 = new JTextField();
        this.jPanel13 = new JPanel();
        this.label8 = new JLabel();
        this.textField5 = new JTextField();
        this.jPanel14 = new JPanel();
        this.label9 = new JLabel();
        this.textField6 = new JTextField();
        this.jPanel15 = new JPanel();
        this.label10 = new JLabel();
        this.textField7 = new JTextField();
        this.jPanel16 = new JPanel();
        this.label11 = new JLabel();
        this.textField8 = new JTextField();
        this.jPanel17 = new JPanel();
        this.label12 = new JLabel();
        this.label13 = new JLabel();
        this.jPanel18 = new JPanel();
        this.textField9 = new JTextField();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jPanel11 = new JPanel();
        this.label14 = new JLabel();
        this.label15 = new JLabel();
        this.label16 = new JLabel();
        this.label17 = new JLabel();
        this.label18 = new JLabel();
        this.label19 = new JLabel();
        radioButton1 = new JRadioButton("支付宝");
        radioButton2 = new JRadioButton("银行卡", true);
        bg = new ButtonGroup();
        this.textArea1 = new JTextArea();
        DefaultCaret caret = (DefaultCaret) this.textArea1.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        this.scroll = new JScrollPane(this.textArea1);
        this.textArea1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.textArea1.setColumns(40);
        setDefaultCloseOperation(3);
        this.jPanel1.setLayout(new BorderLayout());
        this.jPanel2.setLayout(new GridLayout(1, 3));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "登陆"));
        this.jPanel3.setToolTipText("");
        this.jPanel3.setLayout(new GridLayout(5, 1));
        this.jLabel1.setText("用户名:");
        this.jPanel4.add(this.jLabel1);
        this.textField1.setText("");
        this.jPanel4.add(this.textField1);
        this.jPanel3.add(this.jPanel4);
        this.jLabel2.setText("  密码:");
        this.jPanel5.add(this.jLabel2);
        this.textField2.setText("");
        this.jPanel5.add(this.textField2);
        this.jPanel3.add(this.jPanel5);

      /*this.jLabel3.setText("验证码:");
        this.jPanel6.add(this.jLabel3);
        this.textField3.setText("767498");
        this.jPanel6.add(this.textField3);
        this.jPanel3.add(this.jPanel6);*/

        this.jLabel66.setText("扫描频率ms:");
        this.jPanel77.add(this.jLabel66);
        this.textField66.setText("250");
        this.jPanel77.add(this.textField66);
        this.jPanel3.add(this.jPanel77);
        this.jButton1.setText("登陆");
        this.jPanel7.add(this.jButton1);
        this.jButton2.setText("免登陆打开网站");
        this.jPanel7.add(this.jButton2);
        this.jPanel3.add(this.jPanel7);
        this.textField53.setText("");
        this.jPanel50.add(this.textField53);
        this.jButton54.setText("快捷登陆");
        this.jPanel50.add(this.jButton54);
        this.jPanel3.add(this.jPanel50);
        this.jPanel2.add(this.jPanel3);
        this.jPanel8.setLayout(new GridLayout(7, 1));
        this.label1.setText("使用方法:");
        this.jPanel8.add(this.label1);
        this.label2.setText("1.填好用户名密码验证码扫描频率");
        this.jPanel8.add(this.label2);
        this.label3.setText("2.点击登录");
        this.jPanel8.add(this.label3);
        this.label4.setText("3.点击开始锁单按钮");
        this.jPanel8.add(this.label4);

       /* this.label5.setText("使用工具期间,请勿登陆网站");
        this.jPanel8.add(this.label5);
        this.label6.setText("请使用免登录进入网站功能");
        this.jPanel8.add(this.label6);*/

        bg.add(radioButton1);
        bg.add(radioButton2);
        jPanel8.add(radioButton1);
        jPanel8.add(radioButton2);
        this.jButton3.setText("开始锁单");
        this.jPanel8.add(this.jButton3);
        this.jPanel2.add(this.jPanel8);
        this.jPanel1.add(this.jPanel2, "North");
        this.jPanel9.setLayout(new BorderLayout());
        this.jPanel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(""), "订单信息"));
        this.jPanel10.setLayout(new GridLayout(8, 1));
        this.jPanel12.setLayout(new BorderLayout());
        this.label7.setText("　兑换类型:");
        this.jPanel12.add(this.label7, "West");
        this.textField4.setText("");
        this.jPanel12.add(this.textField4, "Center");
        this.jPanel10.add(this.jPanel12);
        this.jPanel13.setLayout(new BorderLayout());
        this.label8.setText("平台订单号:");
        this.jPanel13.add(this.label8, "West");
        this.textField5.setText("");
        this.jPanel13.add(this.textField5, "Center");
        this.jPanel10.add(this.jPanel13);
        this.jPanel14.setLayout(new BorderLayout());
        this.label9.setText("收款支付宝:");
        this.jPanel14.add(this.label9, "West");
        this.textField6.setText("");
        this.jPanel14.add(this.textField6, "Center");
        this.jPanel10.add(this.jPanel14);
        this.jPanel15.setLayout(new BorderLayout());
        this.label10.setText("收款人姓名:");
        this.jPanel15.add(this.label10, "West");
        this.textField7.setText("");
        this.jPanel15.add(this.textField7, "Center");
        this.jPanel10.add(this.jPanel15);
        this.jPanel16.setLayout(new BorderLayout());
        this.label11.setText("　订单金额:");
        this.jPanel16.add(this.label11, "West");
        this.textField8.setText("");
        this.jPanel16.add(this.textField8, "Center");
        this.jPanel10.add(this.jPanel16);
        this.jPanel17.setLayout(new BorderLayout());
        this.label12.setText("　订单状态:");
        this.jPanel17.add(this.label12, "West");
        this.label13.setText("锁单失败");
        this.jPanel17.add(this.label13, "Center");
        this.jPanel10.add(this.jPanel17);
        this.jPanel18.setLayout(new BorderLayout());
        this.textField9.setText("点错了");
        this.jPanel18.add(this.textField9, "Center");
        this.jButton4.setText("拒绝");
        this.jPanel18.add(this.jButton4, "East");
        this.jPanel10.add(this.jPanel18);
        this.jButton5.setText("完成订单");
        this.jPanel10.add(this.jButton5);
        this.jPanel9.add(this.jPanel10, "Center");
        this.jPanel11.setLayout(new GridLayout(6, 1));
        this.label14.setText("尝试次数");
        this.jPanel11.add(this.label14);
        this.label15.setText("0");
        this.jPanel11.add(this.label15);
        this.label16.setText("成功次数");
        this.jPanel11.add(this.label16);
        this.label17.setText("0");
        this.jPanel11.add(this.label17);
        this.label18.setText("失败次数");
        this.jPanel11.add(this.label18);
        this.label19.setText("0");
        this.jPanel11.add(this.label19);
        this.jPanel9.add(this.jPanel11, "East");
        this.jPanel1.add(this.jPanel9, "Center");
        this.label99.setText("此工具仅为辅助工具代替手工, 请勿用于商业或违法行为, 否则后果自负!");
        this.jPanel1.add(this.label99, "South");
        getContentPane().add(this.jPanel1, "West");
        getContentPane().add(this.scroll, "Center");
        pack();
    }

    private void initAction() {
        this.jButton1.addActionListener(e -> {
            String username = this.textField1.getText();
            String password = this.textField2.getText();
            String code = "147258";
            String threadMs = this.textField66.getText();
            String token1 = Spider.login(username, password, code, threadMs);
            if (token1 == null) JOptionPane.showMessageDialog(null, "登陆失败");
            else {
                this.token = token1;
                this.userInfo = Spider.queryUserInfo(this.token, threadMs);
                printLog("登陆成功!");
            }
        });
        this.jButton2.addActionListener(e -> {
            if (!checkLogin()) return;
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable trans = new StringSelection("sessionStorage.setItem('x-token','" + this.token + "');sessionStorage.setItem('userInfo','" + this.userInfo + "');document.location.href = 'https://tryd.tinywin.net/#/home';document.location.reload();");
            clipboard.setContents(trans, null);
            JOptionPane.showMessageDialog(null, "请在你的浏览器中按F12后找到Console标签页,并在里面按Ctrl+V,粘贴好后按回车即可!");
        });
        this.jButton54.addActionListener(e -> {
            String threadMs = this.textField66.getText();
            token = textField53.getText();
            userInfo = Spider.queryUserInfo(token, threadMs);
            if (StringUtils.isNotEmpty(userInfo)) printLog("免密登陆成功!");
            else JOptionPane.showMessageDialog(null, "免密登陆失败");
        });
        this.jButton3.addActionListener(e -> {
            if (!checkLogin()) return;
            if ("开始锁单".equals(this.jButton3.getText())) if (!AccountContext.loopFlag) {
                AccountContext.loopFlag = true;
                this.jButton3.setText("停止锁单");
                AccountContext.addThreads(1, 1);
            } else {
                AccountContext.loopFlag = false;
                this.jButton3.setText("开始锁单");
            }
        });
        this.jButton4.addActionListener(e -> {
            if (this.textField5.getText() == null || "".equals(this.textField5.getText())) {
                JOptionPane.showMessageDialog(null, "请等待抓取到订单数据!");
                return;
            }
            if (this.textField9.getText() == null || "".equals(this.textField9.getText())) {
                JOptionPane.showMessageDialog(null, "请填写拒绝理由!");
                return;
            }
            if (!"待支付".equals(this.label13.getText())) {
                JOptionPane.showMessageDialog(null, "请等待成功锁单!");
                return;
            }
            checkLogin();
            boolean cancelStatus = Spider.cancelOrder(this.token, this.textField5.getText(), this.textField9.getText());
            if (cancelStatus) printLog("拒绝订单:" + this.textField5.getText() + "成功!");
            else printLog("拒绝订单:" + this.textField5.getText() + "失败!");
        });
        this.jButton5.addActionListener(e -> {
            if (this.textField5.getText() == null || "".equals(this.textField5.getText())) {
                JOptionPane.showMessageDialog(null, "请等待抓取到订单数据!");
                return;
            }
            if (!"待支付".equals(this.label13.getText())) {
                JOptionPane.showMessageDialog(null, "请等待成功锁单!");
                return;
            }
            checkLogin();
            boolean completeStatus = Spider.complete(this.token, this.textField5.getText());
            if (completeStatus) printLog("完成订单:" + this.textField5.getText() + "成功!");
            else printLog("完成订单:" + this.textField5.getText() + "失败!");
        });
    }

    public JuyingFrame() {
        this.token = null;
        this.userInfo = null;
        initComponents();
        initAction();
    }

    private boolean isLogin() {
        return (this.token != null && !"".equals(this.token));
    }

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    private boolean checkLogin() {
        if (!isLogin()) JOptionPane.showMessageDialog(null, "请先登录!");
        return isLogin();
    }

    public String token;
    private String userInfo;

    public void printLog(String str) {
        (new Thread(() -> {
            this.textArea1.setText(this.textArea1.getText() + "\n" + simpleDateFormat.format(new Date()) + ":" + str);
        })).start();
    }

    public void showLockedOrder() {
        checkLogin();
        Order order = Spider.queryLockedOrder(this.token);
        showOrder(order);
    }

    public void showOrder(Order order) {
        if (order != null) {
            this.textField4.setText(order.getType());
            this.textField5.setText(order.getOid());
            if (order.getType().equals("bankcard")) {
                this.label9.setText("收款银行卡:");
                this.textField6.setText(order.getReceCardNo());
            } else {
                this.textField6.setText(order.getReceAlipayAct());
                this.label9.setText("收款支付宝:");
            }
            this.textField7.setText(order.getReceiptName());
            this.textField8.setText(order.getMoney());
        }
    }

    @Override
    public void run() {
        this.textArea1.setText(this.textArea1.getText() + "\n" + simpleDateFormat.format(new Date()) + ":" + strPic);
    }
}