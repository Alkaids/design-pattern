package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-测试类
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:25
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CarTest {

    public static void main(String[] args) {
        //宝马车工厂获取宝马车相关产品
        CarFactory bmwFactory = new BMWFactory();

        Car bmwCar = bmwFactory.getCar();
        Engine bmwEngine = bmwFactory.getEngine();

        bmwEngine.start();
        bmwCar.run();

        //奔驰车工厂获取奔驰车相关产品
        CarFactory benzFactory = new BenzFactory();

        Car benzCar = benzFactory.getCar();
        Engine benzEngine = benzFactory.getEngine();

        benzEngine.start();
        benzCar.run();
    }
}
