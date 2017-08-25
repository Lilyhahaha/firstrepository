package com.secoo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
//品牌实体类
public class Brand implements Serializable {
    private String id;
    private String brandname;//品牌名
    private List<Code> codes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public List<Code> getCodes() {
        return codes;
    }

    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

    public Brand() {
    }

    public Brand(String id, String brandname, List<Code> codes) {
        this.id = id;
        this.brandname = brandname;
        this.codes = codes;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id='" + id + '\'' +
                ", brandname='" + brandname + '\'' +
                '}';
    }
}
