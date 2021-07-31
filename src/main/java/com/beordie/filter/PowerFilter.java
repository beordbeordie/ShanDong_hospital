package com.beordie.filter;

import com.beordie.utils.ManagerUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 权限拦截
 * @Date 2021/7/29 7:32
 * @Created 30500
 */
public class PowerFilter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
//        System.out.println(url);
        if (ManagerUtil.getManagerName(request) != null) {
//            System.out.println("已登陆通过");
            return true;
        } else if ("/html/login.html".equals(url) || "/login".equals(url)) {
//            System.out.println("请求登陆通过");
            return true;
        } else if (url.startsWith("/Js") || url.startsWith("/Css") || url.startsWith("Images")) {
//            System.out.println("资源请求通过");
            return true;
        }
//        System.out.println("未进行登陆，跳转登录界面");
        response.sendRedirect("/html/login.html");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
