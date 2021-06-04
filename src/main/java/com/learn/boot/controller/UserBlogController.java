package com.learn.boot.controller;

import com.learn.boot.dao.BlogDao;
import com.learn.boot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserBlogController {
    @Autowired
    BlogDao BlogDao;

    @GetMapping("/")
    public String login(Model model) {
        List<Book> books = BlogDao.getAllBookName();
//        for (Book book : books) {
//            System.out.println(book.getBookName());
//            System.out.println(book.getPictureUrl());
//        }
        model.addAttribute("books", books);
        return "user/blog";
    }

    /**
     * @param model
     * @return 用户保存的书籍
     */
    @GetMapping("/blog/book")
    public String getAllBook(Model model) {
        //System.out.println(BlogDao.getBookName("123"));
        List<String> userBooks = BlogDao.getBookName("123");
        model.addAttribute("userBooks", userBooks);
        return "user/book";
    }

    /**
     * @param model
     * @return 工具
     */
    @GetMapping("/blog/tool")
    public String getTool(Model model) {
        //System.out.println(BlogDao.getBookName("123"));
        return "user/tool";
    }

    @PostMapping("/blog/switch")
    public String hexSwitch(@RequestParam("old_hex") Integer oldHex,
                            @RequestParam("new_hex") Integer newHex,
                            @RequestParam("num") String num,
                            Model model) {
        String s = num;
        if (oldHex == 2) {
            if (newHex == 8) {
                //二进制转八进制
                s = Integer.toOctalString(Integer.parseInt(num, 2));
            } else if (newHex == 10) {
                //二进制转十进制
                s = Integer.valueOf(num, 2).toString();
            } else if (newHex == 16) {
                //二进制转十六进制
                s = Integer.toHexString(Integer.parseInt(num, 2));
            }
        } else if (oldHex == 8) {
            if (newHex == 2) {
                //八进制转成二进制
                s = Integer.toBinaryString(Integer.valueOf(num, 8));
            } else if (newHex == 10) {
                //八进制转成十进制
                s = Integer.valueOf(num, 8).toString();
            } else if (newHex == 16) {
                //八进制转成十六进制
                s = Integer.toHexString(Integer.valueOf(num, 8));
            }
        } else if (oldHex == 10) {
            if (newHex == 2) {
                //十进制转成二进制
                s = Integer.toBinaryString(Integer.parseInt(num));
            } else if (newHex == 8) {
                //十进制转成八进制
                s = Integer.toOctalString(Integer.parseInt(num));
            } else if (newHex == 16) {
                //十进制转成十六进制：
                s = Integer.toHexString(Integer.parseInt(num));
            }
        } else if (oldHex == 16) {
            if (newHex == 2) {
                //十六进制转成二进制
                s = Integer.toBinaryString(Integer.valueOf(num, 16));
            } else if (newHex == 8) {
                //十六进制转成八进制
                s = Integer.toOctalString(Integer.valueOf(num, 16));
            } else if (newHex == 10) {
                //十六进制转成十进制
                s = Integer.valueOf(num, 16).toString();
            }
        }
        model.addAttribute("value", s);
        return "user/tool";
    }

    @GetMapping("/blog.html")
    public String userLastLogin(Model model) {
        return "blog";
    }
}
