package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.UserTestController;
import com.example.demo.pojo.User;
import com.example.demo.util.XmlParserUtils;

@Repository
// dao层：数据访问（对用户数据查询）
public class UserDaoA implements UserDao{
    public List<User> operatorUser(){
        // 1 操作数据（解析xml文件，把数据封装到对象中）
        // 动态获取绝对路径
        String path = UserTestController.class.getClassLoader().getResource("user.xml").getPath();
        System.out.println(path);
        List<User> list = XmlParserUtils.parse(path);
        
        return list;
    }
}
