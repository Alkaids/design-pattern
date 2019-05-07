package com.blackj.designpattern.build.bridge;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 桥接模式-具体实现化角色
 * <p>
 * Created by Zhang.Haixin on 2019-05-07 22:57
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class UserDaoImpl implements BaseDao {

    @Override
    public void insert() {
        System.out.println("插入用户数据");
    }

    @Override
    public void delete() {
        System.out.println("删除用户数据");
    }

    @Override
    public void update() {
        System.out.println("更新用户数据");
    }

    @Override
    public void get() {
        System.out.println("获取用户数据");
    }
}
