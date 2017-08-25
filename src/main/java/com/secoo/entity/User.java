package com.secoo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
//用户实体类
public class User implements Serializable {
    private String id;//用户主键id
    private String username;//用户名
    private String password;//用户登录密码，（加密后）
    private String salt;//随机盐
    private Integer telphone;//手机号
    private Integer role;//用户角色，11表示摄影师，22表示美工，33表示审核员
    private List<Task> tasks;

    public User() {
    }

    public User(String id, String username, String password, String salt, Integer telphone, Integer role, List<Task> tasks) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.telphone = telphone;
        this.role = role;
        this.tasks = tasks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getTelphone() {
        return telphone;
    }

    public void setTelphone(Integer telphone) {
        this.telphone = telphone;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", telphone=" + telphone +
                ", role=" + role +
                '}';
    }
}

