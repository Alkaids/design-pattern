package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-数据结构
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 23:08
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChessGame {

    public void whitePlay(GameVisitor visitor) {
       visitor.visitWhite(new WhiteChess());
    }

    public void blackPlay(GameVisitor visitor) {
        visitor.visitBlack(new BlackChess());
    }

}
