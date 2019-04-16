package com.blackj.designpattern.build.prototype;

import java.util.HashMap;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 客户端--汽车生成者
 * <p>
 * Created by Zhang.Haixin on 2019-04-16 23:29
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CarProducer {

    //保存对应类型之间的实例映射
    private HashMap<String, Car> carHashMap = new HashMap<String, Car>();

    //通过别名保存类型实例
    public void keepCar(String carName ,Car car){
        carHashMap.put(carName, car);
    }

    /**
     * 调用抽象实例方法生成实例
     * @param carName
     * @return
     */
    public Car createCar(String carName){
        Car car = carHashMap.get(carName);
        return car.createClone();
    }
}
