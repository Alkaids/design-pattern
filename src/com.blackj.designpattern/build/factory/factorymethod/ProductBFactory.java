package com.blackj.designpattern.build.factory.factorymethod;

import com.blackj.designpattern.build.factory.simplefactory.Product;
import com.blackj.designpattern.build.factory.simplefactory.ProductB;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 工厂方法-ProductB具体工厂
 * <p>
 * Created by Zhang.Haixin on 2019-04-25 22:56
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProductBFactory implements AbstractFactory {

    /**
     * 获取产品B
     * @return 返回产品B
     */
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
