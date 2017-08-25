package com.secoo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
//商品码
public class Code implements Serializable{
    private String id;
    private String code;//商品码
    private Brand brand;//外键约束
    private List<Image> images;//外键约束

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Code() {
    }

    public Code(String id, String code, Brand brand, List<Image> images) {
        this.id = id;
        this.code = code;
        this.brand = brand;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
