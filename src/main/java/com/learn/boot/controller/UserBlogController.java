package com.learn.boot.controller;

import com.learn.boot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserBlogController {
    @Autowired
    UserDao userDao;

    @GetMapping("/blog")
    public String getAllBook(Model model){
        System.out.println(userDao.getBookName("123"));
        List<String> books=userDao.getBookName("123");
        model.addAttribute("books",books);
        return "blog_book";
    }
}
