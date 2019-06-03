package com.blackj.designpattern.build.interperter;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 解释器模式-抽象表达式
 * <p>
 * Created by Zhang.Haixin on 2019-06-03 23:02
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface Expression {

    int interpret(Context context);
}
