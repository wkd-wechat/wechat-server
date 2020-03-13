package com.wkd.wechat.controller;

import com.wkd.wechat.entity.User;
import com.wkd.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getUserById")
    public User getUserById(String id){
        return userService.findUserById(id);
    }
}
