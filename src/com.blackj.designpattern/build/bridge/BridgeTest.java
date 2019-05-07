package com.blackj.designpattern.build.bridge;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 桥接模式-测试类
 * <p>
 * Created by Zhang.Haixin on 2019-05-07 23:25
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BridgeTest {

    public static void main(String[] args) {
        //查询用户数据
        BaseDao userDao = new UserDaoImpl();
        BaseService userService = new UserServiceImpl();
        userService.setBaseDao(userDao);
        userService.get();
        System.out.println();

        //插入订单数据
        BaseDao orderDao = new OrderDaoImpl();
        BaseService orderService = new OrderServiceImpl();
        orderService.setBaseDao(orderDao);
        orderService.insert();
    }
}
