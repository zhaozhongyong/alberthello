package com.zhaozhy.controller;/*
 * @author zzy
 *
 */

import com.zhaozhy.pojo.User;
import com.zhaozhy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     *  页面跳转
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return  page;
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        this.userService.addUser(user);
        return "ok";
    }
}
