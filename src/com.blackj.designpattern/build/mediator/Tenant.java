package com.blackj.designpattern.build.mediator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 中介者模式-具体同事类
 * <p>
 * Created by Zhang.Haixin on 2019-05-24 00:19
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Tenant extends People {

    public Tenant(HouseMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void action(String message) {
        System.out.println("我是租户--" + this.getName() + "：" + message);
    }
}
