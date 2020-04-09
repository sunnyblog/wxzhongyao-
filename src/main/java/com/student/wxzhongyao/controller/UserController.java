package com.student.wxzhongyao.controller;

import com.alibaba.fastjson.JSONObject;
import com.student.wxzhongyao.entity.User;
import com.student.wxzhongyao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/login")
    public User login(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
        System.out.println(userName);
        System.out.println(passWord);
        return userService.login(userName,passWord);
    }

    /**
     * 注册功能
     * @param phone  接受小程序输入的手机号
     * @param nickname  接受小程序输入的昵称
     * @param passWord  接受小程序输入的密码
     * @return
     */
    @PostMapping("user/register") //自定义网址
    public Integer register(@RequestParam("phone") String phone, @RequestParam("nickname") String nickname,@RequestParam("passWord") String passWord){
        //创建用户对象
        User user = new User();
        // 给用户对象赋值微信小程序输入的手机号
        user.setPhone(phone);
        // 给用户对象赋值微信小程序输入的昵称
        user.setName(nickname);
        // 给用户对象赋值微信小程序输入的密码
        user.setPassword(passWord);
        // 向数据库保存用户对象，并接受返回值  保存成功返回1和用户的id
        Integer resulet = userService.register(user);
        // 如果 返回值等于1并且 用户的id不等于空 ，表示注册成功
        if(resulet == 1 && user.getUser_id()!=null) {
            // 注册成功返回用户的id
            return user.getUser_id();
        }
        // 注册失败返回0
        return 0;
    }


}
