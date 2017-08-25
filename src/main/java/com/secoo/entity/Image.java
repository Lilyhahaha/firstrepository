package com.secoo.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/24.
 */
//图片类
public class Image implements Serializable{
    private String id;
    private String oldname;
    private String newname;
    private String path;
    private String type;//图片分类，主图mm，从图ff
    private Double width;//图片的宽
    private Double height;//图片的高
    private String status;//unedit 待编辑,unaudit 未审核,unaudited 未通过审核,audited 通过审核
    private User user;//对应操作人（根据操作人role判断，更新）
    private Image pImage;//外键约束，主图
    private Code code;//外键约束，商品码

    public Image() {
    }

    public Image(String id, String oldname, String newname, String path, String type, Double width, Double height, String status, User user, Image pImage, Code code) {
        this.id = id;
        this.oldname = oldname;
        this.newname = newname;
        this.path = path;
        this.type = type;
        this.width = width;
        this.height = height;
        this.status = status;
        this.user = user;
        this.pImage = pImage;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname;
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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

    public Image getpImage() {
        return pImage;
    }

    public void setpImage(Image pImage) {
        this.pImage = pImage;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", oldname='" + oldname + '\'' +
                ", newname='" + newname + '\'' +
                ", path='" + path + '\'' +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", status='" + status + '\'' +
                '}';
    }
}
