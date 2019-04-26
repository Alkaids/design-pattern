package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-抽象工厂
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:19
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface CarFactory {

    /**
     * 获取汽车
     * @return 汽车
     */
    Car getCar();

    /**
     * 获取引擎
     * @return 引擎
     */
    Engine getEngine();
}
