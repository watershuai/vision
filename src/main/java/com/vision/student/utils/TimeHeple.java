package com.vision.student.utils;

public class TimeHeple {
    private static int token=2;
    public static int testStatic() {
        int  ss=3;
        token=token+ss;
        return token;
    }
}
