package com.secoo.dao;

import com.secoo.entity.User;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface UserDao extends BaseDao<User> {
    public User login(String username);
}
