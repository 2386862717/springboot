package com.learn.boot.controller;

import com.learn.boot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

@Controller
public class IndexController {
    @Autowired
    private UserDao userDao;

    @GetMapping({"login", "/"})
    public String login() {
        return "index";
    }

    //验证账号 密码
    @RequestMapping({"/login"})
    public String check(String userName, String passWord, Model model, HttpSession session) {
        if (userDao.checkPassWord(userName, passWord) == null) {
            model.addAttribute("msg", "账号密码错误");
            return "index";
        } else if (userDao.checkPassWord(userName, passWord).getPower().equals("admin")) {
            //传入前端
            session.setAttribute("userName", userName);
            //数据库插入当前时间
            userDao.updateDate(userName,new Timestamp(System.currentTimeMillis()));
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "无权限访问");
            userDao.updateDate(userName,new Timestamp(System.currentTimeMillis()));
            return "blog";
        }
    }

    @GetMapping("/main.html")
    public String main() {
        return "main";
    }
}
