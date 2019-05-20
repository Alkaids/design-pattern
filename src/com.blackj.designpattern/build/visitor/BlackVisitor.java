package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-具体访问者
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 23:03
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BlackVisitor extends GameVisitor {

    @Override
    public void visitBlack(BlackChess black) {
        black.play();
    }

    @Override
    public void visitWhite(WhiteChess white) {

    }
}
