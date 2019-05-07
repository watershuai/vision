package com.vision.student.action;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.vision.student.bean.CommonMessage;
import com.vision.student.bean.User;
import com.vision.student.service.UserService;
import com.vision.student.utils.ResponseBean;
import com.vision.student.utils.RundomUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/config")
@Slf4j
public class ConfigController {
    @Autowired
    private UserService userService;
    @PostMapping("/baseUpdate")
    @ResponseBody
    @ApiOperation(value = "医生和学生更新视觉信息入口")
    public ResponseBean<String> baseUpdate(CommonMessage commonMessage,HttpServletRequest request) {
       try {
           log.info("更新检查信息获取到的参数为:"+commonMessage.toString());
           User user=(User)request.getSession().getAttribute("user");
           if (user == null){
               return new ResponseBean<String>(201,"请先登录");
           }
           if (!user.getUserName().equals(commonMessage.getCheckDoctorPhone())){
               return new ResponseBean<String>(203,"不可更新不是本人录入得检查信息");
           }
           if (StringUtils.isEmpty(commonMessage.getPhone())){
               return new ResponseBean<String>(201,"学生手机号不可为空");
           }
           commonMessage.setUpdateTime(RundomUtils.getNowTime());
           userService.baseUpdate(commonMessage);
       }catch (Exception e){
           log.info("更新检查信息出现异常",e);
           return new ResponseBean<String>(202,"更新信息异常");
       }
      return new ResponseBean<String>(200,"更新成功");
    }

    @PostMapping("/baseInsert")
    @ResponseBody
    @ApiOperation(value = "医生和学生录入视觉信息入口")
    public ResponseBean<String> baseInsert(CommonMessage commonMessage, HttpServletRequest request) {
        try {
            log.info("新增检查信息获取到的参数为:"+commonMessage.toString());
            User user=(User)request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            if (user.getStatus()!=1){
                return new ResponseBean<String>(203,"用户不是医生不可新增信息");
            }
            CommonMessage message=userService.selectStudent(commonMessage.getPhone());
            if (message != null){
                return new ResponseBean<String>(201,"该学生受检信息已被录入，请勿重复录入");
            }
            commonMessage.setCheckDoctorPhone(user.getUserName());
            commonMessage.setCreatTime(RundomUtils.getNowTime());
            userService.baseInsert(commonMessage);
            User user1=new User();
            user1.setPassWord("123456");
            user1.setStatus(Integer.parseInt("0"));
            user1.setFlag(0);
            user1.setUserName(commonMessage.getPhone());
            user1.setFileNumber(String.valueOf(RundomUtils.rundomSix()));
            userService.insertSelective(user1);
        }catch (Exception e){
            log.info("新增检查信息出现异常",e);
            return new ResponseBean<String>(202,"新增信息异常");
        }
        return new ResponseBean<String>(200,"新增成功");
    }
    /*@PostMapping("/checkInsert")
    @ResponseBody
    public ResponseBean<String> checkInsert(BaseInformation checkInfor) {
        try {

        }catch (Exception e){
            return new ResponseBean<String>(202,"新增检查信息异常");
        }
        return null;
    }
    @PostMapping("/checkUpdate")
    @ResponseBody
    public ResponseBean<String> checkUpdate(CheckInformation checkInfor) {
        try {

        }catch (Exception e){
            return new ResponseBean<String>(202,"更新检查信息异常");
        }
        return null;
    }*/
    @PostMapping("/selectDoctor")
    @ResponseBody
    @ApiOperation(value = "医生和管理员查询学生视觉信息入口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="phone",value="学生手机号", dataType="string"),
            @ApiImplicitParam(name="school",value="学校", dataType="string"),
            @ApiImplicitParam(name="grade",value="年纪", dataType="string"),
            @ApiImplicitParam(name="classd",value="班级",dataType="string")
    })
    public ResponseBean<String> selectDoctor(HttpServletRequest request) {
        log.info("医生查询学生检查信息获得入参为,手机号"+request.getParameter("phone")+",学校"+request.getParameter("school")+",年纪"+request.getParameter("grade")+",班级"+request.getParameter("classd"));
        try {
            User user=(User)request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            Map<String,String> map=new HashMap<>();
            map.put("phone",request.getParameter("phone"));
            map.put("school",request.getParameter("school"));
            map.put("grade",request.getParameter("grade"));
            map.put("classd",request.getParameter("classd"));
            List<CommonMessage>list=userService.selectDoctor(map);
            if (list != null){
                return new ResponseBean<String>(200,"查询成功",JSONObject.toJSONString(list, SerializerFeature.WriteMapNullValue));
            }else {
                return new ResponseBean<String>(203,"没有查到该记录");
            }
        }catch (Exception e){
            log.info("医生查询学生检查信息出现异常",e);
            return new ResponseBean<String>(202,"医生或管理员查询信息异常");
        }
    }
    @PostMapping("/selectStudent")
    @ResponseBody
    @ApiOperation(value = "学生查询自己视觉信息入口")
    public ResponseBean<String> selectStudent(HttpServletRequest request) {
        try {
            User user=(User)request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            CommonMessage commonMessage=userService.selectStudent(user.getUserName());
            if (commonMessage != null){
                return new ResponseBean<String>(200,"查询成功",JSONObject.toJSONString(commonMessage,SerializerFeature.WriteMapNullValue));
            }else {
                return new ResponseBean<String>(203,"没有查到该记录");
            }

        }catch (Exception e){
            log.info("学生查询自己检查信息出现异常",e);
            return new ResponseBean<String>(202,"学生查询个人信息异常");
        }
    }

    /**
     * 管理员操作
     * */
    @PostMapping("/deleteUserName")
    @ResponseBody
    @ApiOperation(value = "删除账号入口")
    @ApiImplicitParam(name = "userName", value = "删除的账号值", required = true, dataType = "String")
    public ResponseBean<String> deleteUserName(HttpServletRequest request){
        log.info("删除账号接收到的参数为:"+request.getParameter("userName"));
        try {
            User user=(User)request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            String userName=request.getParameter("userName");
            if (StringUtils.isEmpty(userName)){
                return new ResponseBean<String>(201,"被删除的账号不得为空");
            }
            if (2 != user.getStatus()){
                return new ResponseBean<String>(201,"该用户不是管理员没有权限删除");
            }
            userService.deleteUserName(userName);
            return new ResponseBean<String>(200,"删除成功");
        }catch (Exception e){
            log.info("删除账号出现异常",e);
            return new ResponseBean<String>(202,"删除用户异常");
        }
    }
    @PostMapping("/selectListUser")
    @ResponseBody
    @ApiOperation(value = "查询用户账号信息")
    public ResponseBean<String> selectListUser(HttpServletRequest request){
        try {
            User user=(User)request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            /*if (2 != user.getStatus()){
                return new ResponseBean<String>(201,"该用户不是管理员不得查询用户账号信息");
            }*/
            List<User>users=userService.selectListUser();
            if (users != null){
                return new ResponseBean<String>(200,"查询用户信息成功",JSONObject.toJSONString(users,SerializerFeature.WriteMapNullValue));
            }else {
                return new ResponseBean<String>(200,"查询用户信息为空");
            }
        }catch (Exception e){
            log.info("查询用户账号信息出现异常",e);
            return new ResponseBean<String>(202,"查询用户账号信息异常");
        }
    }
    @PostMapping("/updateFlag")
    @ResponseBody
    @ApiOperation(value = "更新审核状态入口")
    @ApiImplicitParam(name = "userName", value = "更新的账号值", required = true, dataType = "String")
    public ResponseBean<String> updateFlag(HttpServletRequest request){
        log.info("更新审核状态接收到的参数"+request.getParameter("userName"));
        try {
            User user=(User)request.getSession().getAttribute("user");
            if (user == null){
                return new ResponseBean<String>(201,"请先登录");
            }
            if (2 != user.getStatus()) {
                return new ResponseBean<String>(201, "该用户不是管理员不得查询用户账号信息");
            }
            String userName=request.getParameter("userName");
            if (StringUtils.isEmpty(userName)){
                return new ResponseBean<String>(201,"被更新审核状态的账号不得为空");
            }
            userService.updateFlag(userName);
            return new ResponseBean<String>(200,"更新审核状态成功");
        }catch (Exception e){
            log.info("更新审核状态出现异常",e);
            return new ResponseBean<String>(202,"更新医生审核状态异常");
        }
    }

}
