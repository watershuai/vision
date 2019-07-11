package com.lincoln;

import java.awt.EventQueue; /*    */
import java.text.ParseException; /*    */
import java.util.ArrayList; /*    */
import java.util.List; /*    */

import org.slf4j.Logger; /*    */
import org.slf4j.LoggerFactory;

public class AccountContext {
    private static final Logger logger = LoggerFactory.getLogger(AccountContext.class);
    public static int queryTime = 0;
    public static int failTime = 0;
    public static int successTime = 0;
    public static boolean loopFlag = false;
    public static boolean canLock = true;

    public static void main(String[] args) throws ParseException {
        EventQueue.invokeLater(() -> juyingFrame.setVisible(true));
    }

    public static JuyingFrame juyingFrame = new JuyingFrame();
    public static List<SpiderThread> spiderThreads = new ArrayList();

    public static void addThreads(int i, int beishu) {
        for (int x = 0; x < i; x++) {
            addThread(beishu);
        }
    }

    public static void addThread(int beishu) {
        SpiderThread spiderThread = new SpiderThread(beishu);
        spiderThread.start();
        spiderThreads.add(spiderThread);
    }
}
