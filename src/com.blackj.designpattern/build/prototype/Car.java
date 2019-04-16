package com.blackj.designpattern.build.prototype;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象原型--Car
 * <p>
 * Created by Zhang.Haixin on 2019/04/16 22:48
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Car implements Cloneable {

    /**
     * 打印汽车行驶速度
     */
    public abstract void carSpeed();

    /**
     * 定义了生成Car 实例的抽象方法
     * @return
     */
    public abstract Car createClone();

}