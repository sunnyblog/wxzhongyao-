package com.student.wxzhongyao.services;

import com.student.wxzhongyao.entity.User;

public interface UserService {
    public User login(String userName, String passWord);
    public Integer register(User user);

}
