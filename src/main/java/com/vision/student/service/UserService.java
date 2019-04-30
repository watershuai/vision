package com.vision.student.service;

import com.vision.student.bean.CommonMessage;
import com.vision.student.bean.User;
import com.vision.student.utils.ResponseBean;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;


public interface UserService {

    User select(int id);

    int insertUser(User user);

    String selectTokenId();

    ResponseBean<String> insertSelective(User user);

    User findName(String username);

    User findNameAndPsw(String username,String password);

    int baseUpdate(CommonMessage commonMessage);

    int baseInsert(CommonMessage commonMessage);

    /*String checkInsert(CheckInformation checkInformation);

    String checkUpdate(CheckInformation checkInformation);*/

    CommonMessage selectStudent(String phone);

    List<CommonMessage> selectDoctor(Map<String,String> map);

    /**
     * 管理员操作
     * */
    String deleteUserName(String userName);

    List<User>  selectListUser();

    int updateFlag(String userName);

    int updatePassWord(User user);


}
