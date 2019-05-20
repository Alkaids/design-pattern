package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-具体元素
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 22:59
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class WhiteChess extends Chess {

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visitWhite(this);
    }

    public void play() {
        System.out.println("使用白棋---");
    }
}
