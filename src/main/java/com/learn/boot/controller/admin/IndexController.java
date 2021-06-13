package com.learn.boot.controller.admin;

import com.learn.boot.dao.UserDao;
import com.learn.boot.entity.User;
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

    //验证账号 密码
    @RequestMapping({"/login"})
    public String check(String userName, String passWord, Model model, HttpSession session) {
        User user = userDao.getUser(userName, passWord);
        if (user == null) {
            model.addAttribute("msg", "账号或密码错误");
            return "index";
        } else if (user.getPower().equals("admin")) {
            //传入前端
            session.setAttribute("userName", userName);
            //数据库插入当前时间
            userDao.updateDate(userName,new Timestamp(System.currentTimeMillis()));
            return "redirect:/main.html";
        } else {
            //数据库插入当前时间
            session.setAttribute("userName", userName);
            userDao.updateDate(userName,new Timestamp(System.currentTimeMillis()));
            return "redirect:/blog.html";
        }
    }

    @GetMapping("/main.html")
    public String main() {
        return "main";
    }
}
