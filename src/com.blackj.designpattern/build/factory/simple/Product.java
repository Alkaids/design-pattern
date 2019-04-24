package com.blackj.designpattern.build.factory.simple;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 简单工厂-抽象产品
 * <p>
 * Created by Zhang.Haixin on 2019-04-24 21:41
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface Product {

    /**
     * 定义初始化方法
     */
    void create();

    /**
     * 使用产品方法
     */
    void use();
}
