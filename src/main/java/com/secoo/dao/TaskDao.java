package com.secoo.dao;

import com.secoo.entity.Brand;
import com.secoo.entity.Task;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface TaskDao extends BaseDao<Task> {
    //根据用户id查看当前用户的所有未完成任务
    public List<Task> queryByPid(String pid);
}
