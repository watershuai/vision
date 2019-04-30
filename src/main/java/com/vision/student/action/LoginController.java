package com.vision.student.action;


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


@Controller
@RequestMapping(value = "user")
@Slf4j
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    @ResponseBody
    @ApiOperation(value = "注册入口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value="用户名", required = true,dataType="string"),
            @ApiImplicitParam(name="password",value="密码", required = true,dataType="string"),
            @ApiImplicitParam(name="status",value="用户类别，0 学生，1 医生 ，2 管理员", required = true,dataType="string"),
            @ApiImplicitParam(name="tokenId",value="管理员输入的邀请码",dataType="string"),
            @ApiImplicitParam(name="remake",value="备注",dataType="string")
           })
    public ResponseBean<String> register(HttpServletRequest request){
        User user1=new User();
        String status=request.getParameter("status");
        user1.setPassWord(request.getParameter("password"));
        user1.setTokenId(request.getParameter("tokenId"));
        user1.setRemake(request.getParameter("remake"));
        user1.setUserName(request.getParameter("username"));
        user1.setStatus(Integer.parseInt(status));
        log.info("注册获取到的参数为:"+user1.toString());
        return userService.insertSelective(user1);

    }
    @PostMapping("/doLogin")
    @ResponseBody
    @ApiOperation(value = "登陆入口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value="用户名", required = true,dataType="string"),
            @ApiImplicitParam(name="password",value="密码", required = true,dataType="string")
    })
    public ResponseBean<String> doLogin(HttpServletRequest request) {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            log.info("用户登陆，接收到用户名为"+username+",接收到密码为"+password);
            User user1=userService.findName(username);
            if (user1!=null && user1.getStatus()==1 && user1.getFlag()==1){
                return new ResponseBean<String>(201,"该用户账号未审核，请先审核");
            }
            User user= userService.findNameAndPsw(username, password);
            if (user != null  && user.getUserName().equals(username)) {
                request.getSession().setAttribute("user",user);
                return new ResponseBean<String>(200,"登陆成功");
            } else {
                return new ResponseBean<String>(201,"用户名或密码不正确");
            }
        }catch (Exception e){
            log.info("用户登录出现异常",e);
            return new ResponseBean<String>(203,"用户登录出现异常");
        }
    }
    @PostMapping("/updatePassWord")
    @ResponseBody
    @ApiOperation(value = "修改密码入口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value="用户名", required = true,dataType="string"),
            @ApiImplicitParam(name="password",value="新密码", required = true,dataType="string")
    })
    public ResponseBean<String> updatePassWord(HttpServletRequest request){
        try {
            String userName=request.getParameter("username");
            String passWord=request.getParameter("password");
            log.info("修改密码，接收到用户名为"+userName+",接收到密码为"+passWord);
            User user=new User();
            if (StringUtils.isNotEmpty(passWord)) {
                user.setPassWord(passWord);
            }
            if (StringUtils.isNotEmpty(userName)) {
                user.setUserName(userName);
            }
            user.setUpdateTime(RundomUtils.getNowTime());
            userService.updatePassWord(user);
            return new ResponseBean<String>(200,"改密成功");
        }catch (Exception e){
            log.info("修改密码出现异常",e);
            return new ResponseBean<String>(203,"改密出现异常");
        }
    }

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

}
