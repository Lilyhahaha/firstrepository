package com.secoo.dao;

import com.secoo.entity.Code;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface CodeDao extends BaseDao<Code> {
    public List<Code> queryByBrand(String bid);
}
