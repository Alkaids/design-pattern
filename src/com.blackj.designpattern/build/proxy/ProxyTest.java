package com.blackj.designpattern.build.proxy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-客户端 测试类
 * <p>
 * Created by Zhang.Haixin on 2019-04-29 23:35
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProxyTest {

    /**
     * main函数模拟整个代购过程
     */
    public static void main(String[] args) {
        NormalUser normalUser = new NormalUser("张三");
        ProxyUser proxyUser = new ProxyUser("李四", normalUser);

        proxyUser.buy();
    }
}
