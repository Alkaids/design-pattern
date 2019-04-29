package com.blackj.designpattern.build.proxy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-被代理类 普通用户
 * <p>
 * Created by Zhang.Haixin on 2019-04-29 23:23
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class NormalUser implements Action {

    /**
     * 用户名
     */
    public String userName;

    /**
     * 构造函数
     * @param userName 用户名
     */
    public NormalUser(String userName) {
        this.userName = userName;
    }

    /***
     * 用户购买方法
     */
    @Override
    public void buy() {
        System.out.println(userName +"付钱购买商品！");
    }
}
