package com.secoo.service.impl;

import com.secoo.entity.User;
import com.secoo.service.UserService;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/25.
 */
@Resource
public class UserServiceImpl implements UserService {
    @Override
    public void regist(User user) {
        user.setId(UUID.randomUUID().toString());

    }

    @Override
    public User login(String username) {
        return null;
    }
}
