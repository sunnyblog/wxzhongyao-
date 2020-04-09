package com.student.wxzhongyao.dao;

import com.student.wxzhongyao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User login(String userName, String passWord);
    public Integer register(User user);

}
