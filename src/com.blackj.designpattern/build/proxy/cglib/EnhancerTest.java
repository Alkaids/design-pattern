package com.blackj.designpattern.build.proxy.cglib;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-动态代理 CGLib 测试类
 * <p>
 * Created by Zhang.Haixin on 2019-05-02 23:39
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class EnhancerTest {

    public static void main(String[] args) {

        //被代理的对象
        CarProxyImpl proxy = new CarProxyImpl();

        //代理增强库
        CarProxyLib proxyLib = new CarProxyLib();

        //代理对象
        CarProxyImpl carProxyImpl = (CarProxyImpl) proxyLib.getInstance(proxy);

        //执行目标函数
        carProxyImpl.sellCar();
    }
}
