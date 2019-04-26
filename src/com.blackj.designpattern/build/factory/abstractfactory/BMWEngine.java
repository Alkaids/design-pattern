package com.blackj.designpattern.build.factory.abstractfactory;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 抽象工厂模式-具体产品宝马引擎
 * <p>
 * Created by Zhang.Haixin on 2019-04-26 22:12
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BMWEngine implements Engine {

    @Override
    public void start() {
        System.out.println("宝马引擎发动声音---嗡-嗡-嗡");
    }
}
