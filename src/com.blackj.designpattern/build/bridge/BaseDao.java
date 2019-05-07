package com.blackj.designpattern.build.bridge;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 桥接模式-实现化角色
 * <p>
 * Created by Zhang.Haixin on 2019-05-07 22:53
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface BaseDao {

    /**
     * 插入数据方法
     */
    void insert();

    /**
     * 删除数据方法
     */
    void delete();

    /**
     * 更新数据方法
     */
    void update();

    /**
     * 获取数据方法
     */
    void get();
}
