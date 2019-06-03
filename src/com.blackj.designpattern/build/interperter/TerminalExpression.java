package com.blackj.designpattern.build.interperter;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 解释器模式-终结符表达式
 * <p>
 * Created by Zhang.Haixin on 2019-06-03 23:11
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class TerminalExpression implements Expression {

    private String variable;

    public TerminalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.lookup(this);
    }
}
