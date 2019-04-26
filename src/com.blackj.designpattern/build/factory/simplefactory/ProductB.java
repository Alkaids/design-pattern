package com.blackj.designpattern.build.factory.simplefactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 简单工厂-具体产品B
 * <p>
 * Created by Zhang.Haixin on 2019-04-24 21:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProductB implements Product {

    /**
     * 构造函数
     */
    public ProductB() {
        System.out.println("ProductB");
    }

    /**
     * 初始化方法
     */
    @Override
    public void create() {
        //进行初始化逻辑
        System.out.println("ProductB 初始化完成");
    }

    /**
     * 使用产品
     */
    @Override
    public void use() {
        System.out.println("使用 ProductB");
    }
}
