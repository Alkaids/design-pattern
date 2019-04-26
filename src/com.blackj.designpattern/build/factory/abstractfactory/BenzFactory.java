package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-具体工厂奔驰厂
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:24
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BenzCar();
    }

    @Override
    public Engine getEngine() {
        return new BenzEngine();
    }
}
