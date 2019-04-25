package com.blackj.designpattern.build.factory.abstractfactory;

import com.blackj.designpattern.build.factory.simple.Product;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 工厂方法模式-测试类
 * <p>
 * Created by Zhang.Haixin on 2019-04-25 23:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class FactoryTest {

    public static void main(String[] args) {
        //获取产品A并使用
        AbstractFactory productAFactory = new ProductAFactory();
        Product productA = productAFactory.getProduct();
        productA.use();

        //获取产品B并使用
        AbstractFactory productBFactory = new ProductAFactory();
        Product productB = productAFactory.getProduct();
        productB.use();
    }
}
