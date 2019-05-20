package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-抽象访问者
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 22:52
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class GameVisitor {

    /**
     * 访问白棋
     * @param white 白棋
     */
    public abstract void visitWhite(WhiteChess white);

    /**
     * 访问黑棋
     * @param black 黑棋
     */
    public abstract void visitBlack(BlackChess black);
}
