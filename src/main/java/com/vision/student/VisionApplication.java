package com.vision.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.vision.student.dao")
public class VisionApplication {

    public static void main(String[] args) {
        System.out.print("开始启动");
        SpringApplication.run(VisionApplication.class, args);
        System.out.print("启动成功");
    }
}