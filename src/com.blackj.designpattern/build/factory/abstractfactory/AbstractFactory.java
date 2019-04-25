package com.blackj.designpattern.build.factory.abstractfactory;

import com.blackj.designpattern.build.factory.simple.Product;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 工厂方法模式-抽象工厂
 * <p>
 * Created by Zhang.Haixin on 2019-04-25 22:45
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface AbstractFactory {

    /**
     * 定义获得产品的方法
     * @return 返回产品
     */
    Product getProduct();
}
