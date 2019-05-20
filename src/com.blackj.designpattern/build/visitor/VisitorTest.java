package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-测试类
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 23:18
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class VisitorTest {

    public static void main(String[] args) {

        ChessGame game = new ChessGame();

        WhiteVisitor whiteChess = new WhiteVisitor();
        BlackVisitor blackChess = new BlackVisitor();

        System.out.println("开始下棋：");
        game.whitePlay(whiteChess);
        game.blackPlay(blackChess);
    }
}
