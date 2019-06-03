package com.blackj.designpattern.build.interperter;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 解释器模式-非终结符表达式
 * <p>
 * Created by Zhang.Haixin on 2019-06-03 23:15
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class PlusExpression extends NonTerminalExpression {

    public PlusExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret(Context context) {
        return this.expression1.interpret(context) + this.expression2.interpret(context);
    }
}
