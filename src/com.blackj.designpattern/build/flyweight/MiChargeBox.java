package com.blackj.designpattern.build.flyweight;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 享元模式-非共享享元
 * <p>
 * Created by Zhang.Haixin on 2019-05-11 22:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class MiChargeBox implements ChargeBox {

    /**
     * 充电宝拥有者
     */
    private String owner;

    /**
     * 构造方法 传入拥有者姓名
     * @param owner
     */
    public MiChargeBox(String owner) {
        this.owner = owner;
    }

    /**
     * 小米充电方法
     */
    @Override
    public void charge() {
        System.out.println("充电宝拥有者：" + this.owner + "使用小米充电包进行充电");
    }
}
