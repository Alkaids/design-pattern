package com.blackj.designpattern.build.mediator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 中介者模式-具体同事类
 * <p>
 * Created by Zhang.Haixin on 2019-05-24 00:11
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class HouseOwner extends People {

    public HouseOwner(HouseMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void action(String message) {
        System.out.println("我是房主--" + this.getName() + "：" + message);
    }
}
