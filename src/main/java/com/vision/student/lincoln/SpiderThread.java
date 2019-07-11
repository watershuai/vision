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
                AccountContext.juyingFrame.jButton3.setText("��ʼ����");
            }
            for (int i = 0; i < this.beishu; i++) {
                AccountContext.queryTime++;
                AccountContext.juyingFrame.label15.setText(String.valueOf(AccountContext.queryTime));
            }
            if (orderList == null) {
                continue;
            }

            if (orderList.size() == 0) {
                AccountContext.juyingFrame.printLog("�Ѿ������Ķ���");
                AccountContext.loopFlag = false;
                AccountContext.juyingFrame.showLockedOrder();
                AccountContext.juyingFrame.label13.setText("��֧��");
                AccountContext.juyingFrame.jButton3.setText("��ʼ����");
                (new Thread(() -> {
                    if (!dialogFlag) {
                        dialogFlag = true;
                        Utils.playSound();
                        dialogFlag = false;
                    }
                })).start();
                (new Thread(() -> {
                    Object[] options ={ "�ر�����", "ȷ��" };  //�Զ��尴ť�ϵ�����
                    int m = JOptionPane.showOptionDialog(null, "�д��ڴ�֧������,�봦��", "��ʾ",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    if (0 == m){
                        Utils.flag=false;
                    }
                })).start();
                return;
            }

            String oid = (orderList.get(0)).getOid();
            boolean lockStatus = Spider.lockOrder(AccountContext.juyingFrame.token, oid);
            AccountContext.juyingFrame.showOrder(orderList.get(0));
            AccountContext.juyingFrame.label13.setText("������");
            if (lockStatus) {
                AccountContext.successTime++;
                AccountContext.juyingFrame.label17.setText(String.valueOf(AccountContext.successTime));
                AccountContext.juyingFrame.showLockedOrder();
                AccountContext.juyingFrame.label13.setText("��֧��");
                AccountContext.juyingFrame.printLog(oid + "�����ɹ�!");
                (new Thread(() -> {
                    if (!dialogFlag) {
                        dialogFlag = true;
                        Utils.playSound();
                        dialogFlag = false;
                    }
                })).start();

                (new Thread(() -> {
                        Object[] options ={ "�ر�����", "ȷ��" };  //�Զ��尴ť�ϵ�����
                        int m = JOptionPane.showOptionDialog(null, "�д��ڴ�֧������,�봦��", "��ʾ",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        if (0 == m){
                            Utils.flag=false;
                        }
                })).start();
                AccountContext.loopFlag = false;
                AccountContext.juyingFrame.jButton3.setText("��ʼ����");
                return;
            }
            AccountContext.failTime++;
            AccountContext.juyingFrame.label19.setText(String.valueOf(AccountContext.failTime));
            AccountContext.juyingFrame.label13.setText("����ʧ��");
            AccountContext.juyingFrame.printLog(oid + "����ʧ��!");
        }
    }
}