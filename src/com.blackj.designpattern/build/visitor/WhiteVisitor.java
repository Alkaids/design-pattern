package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-具体访问者
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 23:06
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class WhiteVisitor extends GameVisitor {

    @Override
    public void visitWhite(WhiteChess white) {
        white.play();
    }

    @Override
    public void visitBlack(BlackChess black) {

    }
}
