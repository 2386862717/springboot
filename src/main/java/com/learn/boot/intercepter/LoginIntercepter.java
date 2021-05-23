package com.learn.boot.intercepter;

import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginIntercepter implements HandlerInterceptor {
    /**
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     *
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录检查
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("userName");
        if (loginUser == null) {
            request.setAttribute("msg", "请重新登录");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
