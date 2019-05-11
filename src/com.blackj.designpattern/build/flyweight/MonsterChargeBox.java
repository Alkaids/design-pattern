package com.blackj.designpattern.build.flyweight;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 享元模式-具体享元
 * <p>
 * Created by Zhang.Haixin on 2019-05-11 22:06
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class MonsterChargeBox implements ChargeBox {

    /**
     * 共享充电宝使用者
     */
    private String userName;

    /**
     * 构造函数出入使用者
     * @param userName
     */
    public MonsterChargeBox(String userName) {
        this.userName = userName;
    }

    @Override
    public void charge() {
        System.out.println("充电宝使用者：" + this.userName + "使用怪兽共享充电宝进行充电");
    }
}
