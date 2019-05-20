package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-具体元素
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 23:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BlackChess extends Chess {

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visitBlack(this);
    }

    public void play() {
        System.out.println("使用黑棋+++");
    }
}
