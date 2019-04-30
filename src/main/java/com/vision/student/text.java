package com.vision.student;


import com.vision.student.bean.User;
import com.vision.student.service.UserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class text {
    @Autowired
    private UserServiceImpl us;


    @org.junit.Test
    public void adduser() {
        User u = new User();
        u.setPassWord("123456");
        u.setUserName("root");
        u.setTokenId("123456");
        u.setStatus(2);
        us.insertSelective(u);
    }
}
