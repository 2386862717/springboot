package com.learn.boot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SearchController {

//
    @GetMapping("/blog.html")
    public String userLastLogin(Model model) {
        return "blog";
    }
}

