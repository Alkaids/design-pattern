package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-具体产品奔驰引擎
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:16
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BenzEngine implements Engine {

    @Override
    public void start() {
        System.out.println("奔驰车引擎发动声音---呜-呜-呜");
    }
}
