package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@RestController
public class UserTestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/operatorUser")
    public Result operatorUser(){
        // 1 获取业务层处理后的集合数据
        List<User> list = userService.operatorUser();
        
        // 3 把数据封装响应给客户端
        return Result.success(list);
    }
}