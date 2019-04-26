package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-具体产品宝马车
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:04
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BMWCar implements Car {

    @Override
    public void run() {
        System.out.println("宝马车时速在240km/h左右");
    }
}
