package com.vision.student.service;
import com.vision.student.bean.CommonMessage;
import com.vision.student.bean.User;
import com.vision.student.dao.UserMapper;
import com.vision.student.utils.ResponseBean;
import com.vision.student.utils.RundomUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    public UserMapper userMapper;

    @Override
    public User select(int id) {

        return userMapper.select(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public String selectTokenId() {
        return userMapper.selectTokenId();
    }

    @Override
    public ResponseBean<String> insertSelective(User user) {
        if (user.getStatus() == 2){
            if (StringUtils.isEmpty(user.getTokenId())){
                return new ResponseBean<String>(201,"口令不得为空");
            }else if (!user.getTokenId().equals(userMapper.selectTokenId())){
                return new ResponseBean<String>(201,"口令不正确");
            }
            user.setFlag(0);
        }
        if (user.getStatus() == 1){
            user.setJobNumber(String.valueOf(RundomUtils.rundomSix()));
            user.setFlag(1);
        }
        User user1=userMapper.findName(user.getUserName());
        if (user1 != null){
            return new ResponseBean<String>(201,"该账号已被使用,不可注册");
        }
        try {
            user.setCreatTime(RundomUtils.getNowTime());
            userMapper.insertSelective(user);
            return new ResponseBean<String>(200,"注册成功");
        }catch (Exception e){
            log.info("注册发生异常",e);
            return new ResponseBean<String>(201,"注册出现异常");
        }

    }

    @Override
    public User findName(String username) {
        return userMapper.findName(username);
    }

    @Override
    public User findNameAndPsw(String username, String password) {
        User user=new User();
        user.setUserName(username);
        user.setPassWord(password);
        return userMapper.findNameAndPsw(user);
    }

    //++++++++++++++++++++++++++

    @Override
    public int baseUpdate(CommonMessage commonMessage) {
        return userMapper.baseUpdate(commonMessage);
    }

    @Override
    public int baseInsert(CommonMessage commonMessage) {
        return userMapper.baseInsert(commonMessage);
    }

    /*@Override
    public String checkInsert(CheckInformation checkInformation) {
        return userMapper.checkInsert(checkInformation);
    }*/

    /*@Override
    public String checkUpdate(CheckInformation checkInformation) {
        return userMapper.checkUpdate(checkInformation);
    }*/

    @Override
    public CommonMessage selectStudent(String phone) {
        return userMapper.selectStudent(phone);
    }

    @Override
    public List<CommonMessage> selectDoctor(Map<String, String> map) {
        return userMapper.selectDoctor(map);
    }

    @Override
    public String deleteUserName(String userName) {
        return userMapper.deleteUserName(userName);
    }

    @Override
    public List<User> selectListUser(int status) {
        return userMapper.selectListUser(status);
    }

    @Override
    public int updateFlag(String userName) {
        return userMapper.updateFlag(userName);
    }

    @Override
    public int updatePassWord(User user) {
        User user1=userMapper.findName(user.getUserName());
        if (user1 == null){
            return 5;
        }
        return userMapper.updatePassWord(user);
    }
}


