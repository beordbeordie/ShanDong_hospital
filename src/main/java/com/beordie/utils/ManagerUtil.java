package com.beordie.utils;

import com.beordie.model.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 用户的登陆管理
 * @Date 2021/7/28 20:31
 * @Created 30500
 */
public class ManagerUtil {
    /**
     * @description 登陆成功设置相应的session对话信息
     * @author 30500
     * @date 2021/7/28 20:33
     * @type [javax.servlet.http.HttpServletRequest, com.beordie.model.User 当前登录成功的用户信息]
     * @return void
     */
    public static void loginSuccess(HttpServletRequest request, User user) {
        request.getSession().setAttribute("user", user);
    }

    /**
     * @description 退出登陆清除对应的session信息
     * @author 30500
     * @date 2021/7/28 20:35
     * @type [javax.servlet.http.HttpServletRequest]
     * @return void
     */
    public static void quitSuccess(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        System.out.println("session清除成功，退出");
    }

    /**
     * @description 获取当前登录用户的姓名
     * @author 30500
     * @date 2021/7/28 20:42
     * @type [javax.servlet.http.HttpServletRequest]
     * @return java.lang.String
     */
    public static String getManagerName(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        String name = null;
        if (user != null )
            name = user.getTrueName();
        return name;
    }
}
