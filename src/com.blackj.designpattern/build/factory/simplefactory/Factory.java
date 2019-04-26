package com.blackj.designpattern.build.factory.simplefactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 简单工厂模式-工厂类
 * <p>
 * Created by Zhang.Haixin on 2019-04-24 21:40
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Factory {

    /**
     * 通过产品名称获得具体产品的静态方法
     * @param productName 产品名称
     * @return 具体产品
     */
    public static Product getProduct(String productName) {
        Product product = null;
        if (productName.equalsIgnoreCase("productA")) {
            product =  new ProductA();

            product.create();
        } else if (productName.equalsIgnoreCase("productB")) {
            product = new ProductB();

            product.create();
        }
        return product;
    }
}
