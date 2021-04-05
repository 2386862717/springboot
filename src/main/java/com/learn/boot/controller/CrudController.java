package com.learn.boot.controller;

import com.learn.boot.dao.CrudDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CrudController {
    @Autowired
    private CrudDao crudDao;

    //删除用户
    //因为删除两个表的数据 一个xml标签里要执行多条sql语句 数据库配置要加上allowMultiQueries=true
    @GetMapping("/delete/{userName}")
    public String deleteUser(@PathVariable String userName){
        crudDao.delete(userName);
        return "redirect:/user-information.html";
    }

    @PostMapping("/add")
    public String add(@RequestParam("username") String userName,
                      @RequestParam("password") String passWord){
        crudDao.add(userName,passWord);
        return "redirect:/user-information.html";
    }

    @PostMapping("/update")
    public String update(@RequestParam("userName") String userName,
                      @RequestParam("passWord") String passWord){
        crudDao.update(userName,passWord);
        return "redirect:/user-information.html";
    }
}
