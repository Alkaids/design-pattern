package com.blackj.designpattern.build.mediator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 终结者模式-抽象中介者
 * <p>
 * Created by Zhang.Haixin on 2019-05-24 00:02
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface HouseMediator {

    /**
     * 传递消息
     * @param message 消息
     * @param people 房屋用户
     */
    void sendMessage(String message, People people);
}
