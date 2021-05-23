package com.learn.boot.controller;

import com.learn.boot.dao.BlogDao;
import com.learn.boot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserBlogController {
    @Autowired
    BlogDao BlogDao;

    @GetMapping("/blog/book")
    public String getAllBook(Model model){
        //System.out.println(BlogDao.getBookName("123"));
        List<String> userBooks=BlogDao.getBookName("123");
        model.addAttribute("userBooks",userBooks);
        return "book";
    }

    @GetMapping("/")
    public String login(Model model) {
        List<Book> books = BlogDao.getAllBookName();
//        for (Book book : books) {
//            System.out.println(book.getBookName());
//            System.out.println(book.getPictureUrl());
//        }
        model.addAttribute("books",books);
        return "blog";
    }

    @GetMapping("/blog.html")
    public String userLastLogin(Model model) {
        return "blog";
    }
}
