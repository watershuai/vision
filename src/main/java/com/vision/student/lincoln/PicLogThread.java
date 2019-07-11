package com.lincoln;

public class PicLogThread implements Runnable {
    public String pic="";
    public PicLogThread(String pic){
        this.pic=pic;
    }
    @Override
    public void run() {
        AccountContext.juyingFrame.printLog( "识别出图片验证码为:"+pic);
    }
}
