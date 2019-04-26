package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name:  design-pattern
 * <p>
 * Description: 抽象工厂模式-具体产品奔驰车
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BenzCar implements Car {

    @Override
    public void run() {
        System.out.println("奔驰车时速在300km/h左右");
    }
}
