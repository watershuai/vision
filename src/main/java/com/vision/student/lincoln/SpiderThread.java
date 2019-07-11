package com.lincoln;

import java.util.List; /*    */
import javax.swing.JOptionPane;

public class SpiderThread extends Thread {
    public static boolean dialogFlag = false;
    int beishu;

    public SpiderThread(int beishu) {
        this.beishu = beishu;
    }

    public void run() {
        while (AccountContext.loopFlag) {
            List<Order> orderList = null;
            try {
                orderList = Spider.queryOrders(AccountContext.juyingFrame.token);
            } catch (LoginException ex) {
                AccountContext.loopFlag = false;
                AccountContext.juyingFrame.jButton3.setText("开始锁单");
            }
            for (int i = 0; i < this.beishu; i++) {
                AccountContext.queryTime++;
                AccountContext.juyingFrame.label15.setText(String.valueOf(AccountContext.queryTime));
            }
            if (orderList == null) {
                continue;
            }

            if (orderList.size() == 0) {
                AccountContext.juyingFrame.printLog("已经有锁的订单");
                AccountContext.loopFlag = false;
                AccountContext.juyingFrame.showLockedOrder();
                AccountContext.juyingFrame.label13.setText("待支付");
                AccountContext.juyingFrame.jButton3.setText("开始锁单");
                (new Thread(() -> {
                    if (!dialogFlag) {
                        dialogFlag = true;
                        Utils.playSound();
                        dialogFlag = false;
                    }
                })).start();
                (new Thread(() -> {
                    Object[] options ={ "关闭音乐", "确定" };  //自定义按钮上的文字
                    int m = JOptionPane.showOptionDialog(null, "有存在待支付订单,请处理", "提示",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    if (0 == m){
                        Utils.flag=false;
                    }
                })).start();
                return;
            }

            String oid = (orderList.get(0)).getOid();
            boolean lockStatus = Spider.lockOrder(AccountContext.juyingFrame.token, oid);
            AccountContext.juyingFrame.showOrder(orderList.get(0));
            AccountContext.juyingFrame.label13.setText("待锁单");
            if (lockStatus) {
                AccountContext.successTime++;
                AccountContext.juyingFrame.label17.setText(String.valueOf(AccountContext.successTime));
                AccountContext.juyingFrame.showLockedOrder();
                AccountContext.juyingFrame.label13.setText("待支付");
                AccountContext.juyingFrame.printLog(oid + "锁单成功!");
                (new Thread(() -> {
                    if (!dialogFlag) {
                        dialogFlag = true;
                        Utils.playSound();
                        dialogFlag = false;
                    }
                })).start();

                (new Thread(() -> {
                        Object[] options ={ "关闭音乐", "确定" };  //自定义按钮上的文字
                        int m = JOptionPane.showOptionDialog(null, "有存在待支付订单,请处理", "提示",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (0 == m){
                            Utils.flag=false;
                        }
                })).start();
                AccountContext.loopFlag = false;
                AccountContext.juyingFrame.jButton3.setText("开始锁单");
                return;
            }
            AccountContext.failTime++;
            AccountContext.juyingFrame.label19.setText(String.valueOf(AccountContext.failTime));
            AccountContext.juyingFrame.label13.setText("锁单失败");
            AccountContext.juyingFrame.printLog(oid + "锁单失败!");
        }
    }
}