package com.blackj.designpattern.build.flyweight;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 享元模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-11 22:30
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChargeBoxTest {

    public static void main(String[] args) {

        ChargeBox monster = ChargeBoxFactory.getChargeBox("monster", "张三");
        monster.charge();

        ChargeBox mi = ChargeBoxFactory.getChargeBox("mi", "李四");
        mi.charge();
    }
}
