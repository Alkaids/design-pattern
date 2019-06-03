package com.blackj.designpattern.build.interperter;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 解释器模式-测试类
 * <p>
 * Created by Zhang.Haixin on 2019-06-03 23:23
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class InterpreterTest {

    public static void main(String[] args) {

        Context context = new Context();
        TerminalExpression i = new TerminalExpression("I");
        TerminalExpression ii = new TerminalExpression("II");
        TerminalExpression iii = new TerminalExpression("III");
        TerminalExpression iv = new TerminalExpression("IV");
        TerminalExpression v = new TerminalExpression("V");
        TerminalExpression vi = new TerminalExpression("VI");
        TerminalExpression vii = new TerminalExpression("VII");
        TerminalExpression viii = new TerminalExpression("VIII");
        TerminalExpression viiii = new TerminalExpression("VIIII");

        context.add(i, 1);
        context.add(ii, 2);
        context.add(iii, 3);
        context.add(iv, 4);
        context.add(v, 5);
        context.add(vi, 6);
        context.add(vii, 7);
        context.add(viii, 8);
        context.add(viiii, 9);

        System.out.println("i + v - ii + vii 的结果是：");
        System.out.println("i + v => " + new PlusExpression(i, v).interpret(context));
        System.out.println("i + v - ii => " + new MinusExpression(new PlusExpression(i, v), ii).interpret(context));
        int result = new PlusExpression(new MinusExpression(new PlusExpression(i, v), ii), vii).interpret(context);
        System.out.println("i + v - ii + vii => " +result);
    }
}
