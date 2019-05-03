package com.blackj.designpattern.build.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-jdk 动态代理
 * <p>
 * Created by Zhang.Haixin on 2019-05-01 23:08
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BenzCarHandler implements InvocationHandler {

    /**
     * 定义最终方法调用接口
     */
    private SellCar sellCar;

    public BenzCarHandler(SellCar sellCar) {
        this.sellCar = sellCar;
    }

    /**
     * 动态代理的消息传递
     * @param proxy 代理类
     * @param method 方法
     * @param args 参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始卖车：");
        method.invoke(sellCar, args);
        System.out.println("结束卖车！");
        return null;
    }

}
