package com.blackj.designpattern.build.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-动态代理 JDK代理测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-01 23:25
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class JDKTest {

    public static void main(String[] args) {

        //被代理对象
        SellCar benzCar = new BenzCar();

        //代理处理回调
        BenzCarHandler handler = new BenzCarHandler(benzCar);

        //代理对象
        SellCar proxy = (SellCar) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), new Class[]{SellCar.class}, handler);

        //目标方法
        proxy.sell();
    }
}
