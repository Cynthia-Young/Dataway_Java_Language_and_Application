package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.User;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ResponseController {

    /*
     * @ResponseBody注解：将当前方法返回值直接返回，如果是 实体/集合 转换为Json返回
     * 注意：@RestController注解已经包含了@ResponseBody的作用，无需额外添加
     * 需求1：定义getUser方法，方法中返回User对象
     */
    @RequestMapping("/getUser")
    public Result getUser() {
        User user = new User("yxy", 18, null);
        // Result result = new Result(1, "success", user);
        return Result.success(user);
    }

    // 需求2：定义getList方法，方法中返回List对象
    @RequestMapping("/getList")
    public Result getList() {
        User user1 = new User("yxy", 18, null);
        User user2 = new User("fx", 18, null);
        // 把对象放在集合中
        ArrayList<User> list = new ArrayList<>();
        Collections.addAll(list, user1, user2);
        // 封装响应数据
        // Result result = new Result(1, "success", list);

        return Result.success(list);
    }

    // 需求3：统一
}
