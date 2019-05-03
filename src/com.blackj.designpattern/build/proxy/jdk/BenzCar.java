package com.blackj.designpattern.build.proxy.jdk;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-动态代理 卖奔驰车
 * Created by Zhang.Haixin on 2019-05-01 23:16
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BenzCar implements SellCar {

    /**
     * 卖奔驰车的方法
     */
    @Override
    public void sell() {
        System.out.println("卖奔驰车！！！");
    }
}
