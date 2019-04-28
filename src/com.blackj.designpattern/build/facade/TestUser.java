package com.blackj.designpattern.build.facade;

/**
 * Program Name:
 * <p>
 * Description:
 * <p>
 * Created by Zhang.Haixin on 2019-04-28 17:07
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class TestUser {

    public static void main(String[] args) {
        //不用外观模式用户打开电器
        Conditioner conditioner = new Conditioner();
        conditioner.onAir();

        Light light = new Light();
        light.turnOn();

        TVBox tvBox = new TVBox();
        tvBox.play();

        System.out.println("*************-----++++++++++========");

        //使用外观模式用户打开电器
        UserOperate operate = new UserOperate();
        operate.turnOnAll();
    }
}
