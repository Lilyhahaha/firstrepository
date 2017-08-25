package com.secoo.service;

import com.secoo.entity.User;

/**
 * Created by Administrator on 2017/8/25.
 */
public interface UserService {
    //注册
    public void regist(User user);
    //登陆
    public User login(String username);
}
