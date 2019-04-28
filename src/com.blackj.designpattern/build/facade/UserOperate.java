package com.blackj.designpattern.build.facade;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 外观模式-外观类 用户操作
 * <p>
 * Created by Zhang.Haixin on 2019-04-28 17:02
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class UserOperate {

    /**
     * 家电私有组合
     */
    private Conditioner conditioner = new Conditioner();

    private Light light = new Light();

    private TVBox tvBox = new TVBox();

    /**
     * 打开电器方法
     */
    public void turnOnAll() {
        System.out.println("回家了-打开所有电器");
        conditioner.onAir();
        light.turnOn();
        tvBox.play();
    }

    public void turnOffAll() {
        System.out.println("出门了-关闭所有电器");
        conditioner.offAir();
        light.turnOff();
        tvBox.display();
    }
}
