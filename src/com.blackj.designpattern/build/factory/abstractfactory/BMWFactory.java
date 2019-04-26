package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-具体工厂宝马厂
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:22
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BMWFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BMWCar();
    }

    @Override
    public Engine getEngine() {
        return new BMWEngine();
    }
}
