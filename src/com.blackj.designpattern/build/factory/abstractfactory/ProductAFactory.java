package com.blackj.designpattern.build.factory.abstractfactory;

import com.blackj.designpattern.build.factory.simple.Product;
import com.blackj.designpattern.build.factory.simple.ProductA;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 工厂方法-ProductA具体工厂
 * <p>
 * Created by Zhang.Haixin on 2019-04-25 22:56
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProductAFactory implements AbstractFactory{

    /**
     * 获取产品A
     * @return 返回产品A
     */
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
