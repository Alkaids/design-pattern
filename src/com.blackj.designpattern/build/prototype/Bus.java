package com.blackj.designpattern.build.prototype;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 具体原型--公交车
 * <p>
 * Created by Zhang.Haixin on 2019/04/16 22:48
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Bus extends Car {

    @Override
    public void carSpeed() {
        System.out.println("Bus 时速最多70公里每小时");
    }

    /**
     * 调用clone() 方法返回实例
     * @return
     */
    @Override
    public Car createClone() {
        Car car = null;
        try {
            car = (Car) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return car;
    }
}