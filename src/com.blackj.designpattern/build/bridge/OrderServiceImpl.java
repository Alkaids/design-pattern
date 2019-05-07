package com.blackj.designpattern.build.bridge;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 桥接模式-修正抽象化角色
 * <p>
 * Created by Zhang.Haixin on 2019-05-07 23:10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class OrderServiceImpl extends BaseService {

    @Override
    public void insert() {
        System.out.println("执行订单数据插入操作");
        this.baseDao.insert();
    }

    @Override
    public void delete() {
        System.out.println("执行订单数据删除操作");
        this.baseDao.delete();
    }

    @Override
    public void update() {
        System.out.println("执行订单数据更新操作");
        this.baseDao.update();
    }

    @Override
    public void get() {
        System.out.println("执行订单数据获取操作");
        this.baseDao.get();
    }
}
