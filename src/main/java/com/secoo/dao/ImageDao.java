package com.secoo.dao;

import com.secoo.entity.Brand;
import com.secoo.entity.Image;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface ImageDao extends BaseDao<Image> {
//    根据商品码查看所有图片
    public List<Image> queryByCode(String cid);
}
