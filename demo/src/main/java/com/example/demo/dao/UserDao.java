package com.example.demo.dao;

import java.util.List;

import com.example.demo.pojo.User;

// 接口
public interface UserDao {
    // 抽象方法
    public abstract List<User> operatorUser();
}
