package com.blackj.designpattern.build.factory.simple;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 简单工厂-客户端
 * <p>
 * Created by Zhang.Haixin on 2019-04-24 21:56
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class FactoryClient {

    public static void main(String[] args) {

      /*  //获取A产品
        Product productA = Factory.getProduct("productA");
        productA.use();

        //获取B产品
        Product productB = Factory.getProduct("productB");
        productB.use(); */

        //获取A产品
        Product productA = ReflectFactory.getProduct(ProductA.class);
        productA.use();

        //获取B产品
        Product productB = ReflectFactory.getProduct(ProductB.class);
        productB.use();
    }
}
