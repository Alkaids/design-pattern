package com.blackj.designpattern.build.interperter;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 解释器模式-非终结符表达式
 * <p>
 * Created by Zhang.Haixin on 2019-06-03 23:13
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class NonTerminalExpression implements Expression {


    Expression expression1, expression2;

    public NonTerminalExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
