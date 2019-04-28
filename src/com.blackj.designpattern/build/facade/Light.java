package com.blackj.designpattern.build.facade;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 外观模式-具体类 电灯
 * <p>
 * Created by Zhang.Haixin on 2019-04-28 16:48
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Light {

    /**
     * 打开电灯方法
     */
    public void turnOn() {
        System.out.println("开灯！");
    }

    /**
     * 关闭电灯方法
     */
    public void turnOff() {
        System.out.println("关灯！");
    }
}
