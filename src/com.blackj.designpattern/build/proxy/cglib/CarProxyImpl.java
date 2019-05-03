package com.blackj.designpattern.build.proxy.cglib;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-动态代理 卖车实现类
 * <p>
 * Created by Zhang.Haixin on 2019-05-02 23:12
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CarProxyImpl {

    /**
     * 具体卖车的方法
     */
    public void sellCar() {
        System.out.println("卖车的具体方法！");
    }
}
