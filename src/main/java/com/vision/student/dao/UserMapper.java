package com.vision.student.dao;

import com.vision.student.bean.CommonMessage;
import com.vision.student.bean.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(int id);

    int insertUser(User user);

    String selectTokenId();

    User select(int id);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
    //这个方式我自己加的
    List<User> selectAllUser();
    int insertSelective(User user);

    User findNameAndPsw(User user);

    User findName(String userName);

    int baseUpdate(CommonMessage commonMessage);

    int baseInsert(CommonMessage commonMessage);

    /*String checkInsert(CheckInformation checkInformation);

    String checkUpdate(CheckInformation checkInformation);*/

    CommonMessage selectStudent(String phone);

    List<CommonMessage> selectDoctor(Map<String,String> map);

    String deleteUserName(String userName);

    List<User> selectListUser();

    int updateFlag(String userName);

    int updatePassWord(User user);
}
