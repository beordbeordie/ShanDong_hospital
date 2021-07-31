package com.beordie.controller;

import com.beordie.bean.Message;
import com.beordie.model.User;
import com.beordie.service.IUserService;
import com.beordie.utils.ManagerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Date 2021/7/28 9:01
 * @Created 30500
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userServiceImpl;

    /**
     * @description 登陆
     * @author 30500
     * @date 2021/7/29 8:40
     * @type [java.lang.String 用户名,
     * java.lang.String 用户密码,
     * javax.servlet.http.HttpServletRequest]
     * @return com.beordie.bean.Message 登陆结果
     */
    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Message login(String username, String password, HttpServletRequest request) {
        User user = userServiceImpl.selectByUser(username, password);
        Message<User> message = new Message<>();
        if (user == null) {
            message.setCode(404);
            message.setMsg("找不到用户");
        } else {
            ManagerUtil.loginSuccess(request, user);
            message.setMsg("登陆成功");
            message.setObj(user);
        }
        return message;
    }

    /**
     * @description 查询当前用户名
     * @author 30500
     * @date 2021/7/29 8:40
     * @type [javax.servlet.http.HttpServletRequest]
     * @return com.beordie.bean.Message 查询结果
     */
    @ResponseBody
    @RequestMapping(value = "username", method = RequestMethod.GET)
    public Message getUserName(HttpServletRequest request) {
        String name = ManagerUtil.getManagerName(request);
        return new Message(name);
    }

    /**
     * @description 退出登陆
     * @author 30500
     * @date 2021/7/29 8:40
     * @type [javax.servlet.http.HttpServletRequest]
     * @return com.beordie.bean.Message 返回登陆界面
     */
    @RequestMapping(value = "quit", method = RequestMethod.GET)
    public String quit(HttpServletRequest request) {
        ManagerUtil.quitSuccess(request);
        return "redirect:/html/login.html";
    }
}
