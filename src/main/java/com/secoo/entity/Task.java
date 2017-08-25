package com.secoo.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/24.
 */
//任务实体类
public class Task implements Serializable{
    private String id;
    private String bname;//品牌名
    private String gcode;//商品编号
    private String status;//任务状态unfinish 未完成，inished 已完成
    private User user;//外键约束

    public Task() {
    }

    public Task(String id, String bname, String gcode, String status, User user) {
        this.id = id;
        this.bname = bname;
        this.gcode = gcode;
        this.status = status;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getGcode() {
        return gcode;
    }

    public void setGcode(String gcode) {
        this.gcode = gcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", bname='" + bname + '\'' +
                ", gcode='" + gcode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
