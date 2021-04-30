package com.learn.boot.controller;

import com.learn.boot.dao.UserDao;
import com.learn.boot.entity.User;
import com.learn.boot.entity.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    private UserDao userDao;

    //跳转页面获得用户信息
    @GetMapping("/user-information.html")
    public String userInformation(Model model, HttpSession session) {
        List<User> users = userDao.getAllUser();
        model.addAttribute("users", users);
        return "user-information";
    }

    //获取上次登录时间
    @GetMapping("/user-last-login.html")
    public String userLastLogin(Model model) {
        List<Time> times = userDao.getAllinfo();
        model.addAttribute("times", times);
        return "user-last-login";
    }


}

