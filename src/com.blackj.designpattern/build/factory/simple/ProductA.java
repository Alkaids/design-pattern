package com.blackj.designpattern.build.factory.simple;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 简单工厂-具体产品A
 * <p>
 * Created by Zhang.Haixin on 2019-04-24 21:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProductA implements Product {

    /**
     * 构造函数
     */
    public ProductA() {
        System.out.println("ProductA");
    }

    /**
     * 初始化方法
     */
    @Override
    public void create() {
        //进行初始化逻辑
        System.out.println("ProductA 初始化完成");
    }

    /**
     * 使用产品
     */
    @Override
    public void use() {
        System.out.println("使用 ProductA");
    }
}
