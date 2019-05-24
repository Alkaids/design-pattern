package com.blackj.designpattern.build.mediator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 中介者模式-抽象同事类
 * <p>
 * Created by Zhang.Haixin on 2019-05-24 00:04
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class People {

    /**
     * 中介
     */
    private HouseMediator mediator;

    /**
     * 姓名
     */
    private String name;

    /**
     * 构造函数
     * @param mediator 中介
     * @param name 姓名
     */
    public People(HouseMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public People() {
    }

    public HouseMediator getMediator() {
        return mediator;
    }

    public void setMediator(HouseMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 发送消息
     */
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    /**
     * 接收消息后的行为
     */
    public abstract void action(String message);
}
