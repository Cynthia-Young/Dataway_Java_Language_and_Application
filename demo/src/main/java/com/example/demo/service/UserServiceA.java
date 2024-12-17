package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.User;

@Service
public class UserServiceA implements UserService{
    @Autowired
    private UserDao userDao;
    
    public List<User> operatorUser(){
        // 调用Dao层的方法，获取数据集合
        List<User> list = userDao.operatorUser();

        // 2 业务逻辑操作（把获取的province和city的值进行处理）
        for (User user : list){
            Address address = user.getAddress();
            address.setProvince(address.getProvince() + "省/市");
            address.setCity(address.getCity() + "市/区");
        }

        return list;
    }
}
