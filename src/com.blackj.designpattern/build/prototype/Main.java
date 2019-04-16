package com.blackj.designpattern.build.prototype;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 测试类
 * <p>
 * Created by Zhang.Haixin on 2019/04/16 22:35
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        CarProducer producer = new CarProducer();

        Van van = new Van();

        Bus bus = new Bus();

        producer.keepCar("van", van);

        producer.keepCar("bus", bus);

        Car car = producer.createCar("van");
        car.carSpeed();

        Car car1 = producer.createCar("bus");
        car1.carSpeed();
    }
}