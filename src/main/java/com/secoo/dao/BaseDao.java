package com.secoo.dao;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface BaseDao<T> {
    public void insert(T t);
    public void delete(String id);
    public void update(T t);
    public T queryOne(String id);
    public List<T> queryAll();
}
