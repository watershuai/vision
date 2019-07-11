
package com.lincoln;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javazoom.jl.player.Player;

public class Utils  {
    private static ExecutorService executorService = Executors.newFixedThreadPool(3);
    public static boolean flag=true;
    public static void playSound() {
        while (flag) {
            File file = new File(System.getProperty("user.dir") + "\\play.wav");
            if (!file.exists()) {
                try {
                    file = new File(System.getProperty("user.dir") + "\\play.mp3");
                    BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file));
                    Player player = new Player(buffer);
                    player.play();
                } catch (Exception e) {
                    return;
                }
            } else {
                AudioClip audioClip = null;
                try {
                    audioClip = Applet.newAudioClip(file.toURL());
                    audioClip.play();
                } catch (MalformedURLException e) {
                    return;
                }
            }
        }
        if (flag==false){
            flag=true;
        }
    }
    public static void executorUtils(String str){
        JuyingFrame juyingFrame = new JuyingFrame(str);
        executorService.execute(juyingFrame);
        executorService.shutdown();
    }

    public static String random07(int length) {
        StringBuilder val = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            val.append(random.nextInt(10));
        }
        return val.toString();
    }


}