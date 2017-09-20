package com.test.controller;

import com.test.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lichao on 2017/9/20.
 */
@Controller
@RequestMapping("/test")//Contoller下所有接口统一入口
public class UserController {

    //映射一个action
    @RequestMapping("/user")
    @ResponseBody//表示直接输出返回内容，不进行jsp或html跳转，本例是为了写接口，这里直接返回json
    public UserEntity getUser() {
        //创建一个UserEntity，直接返回，之前在web.xml中配置的jackson会将user对象转为json输出
        UserEntity user = new UserEntity("jack", "123456");
        return user;
    }
}

