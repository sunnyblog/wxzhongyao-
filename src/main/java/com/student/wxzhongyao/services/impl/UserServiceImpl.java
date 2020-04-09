package com.student.wxzhongyao.services.impl;

import com.alibaba.fastjson.JSONObject;
import com.student.wxzhongyao.dao.UserDao;
import com.student.wxzhongyao.entity.User;
import com.student.wxzhongyao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String userName, String passWord) {
        return userDao.login(userName,passWord);
    }

    @Override
    public Integer register(User user) {
        return userDao.register(user);
    }
}
