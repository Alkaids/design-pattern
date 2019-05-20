package com.blackj.designpattern.build.visitor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 访问者模式-抽象元素
 * <p>
 * Created by Zhang.Haixin on 2019-05-20 22:57
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Chess {

    /**
     * 访问接口
     * @param visitor 访问者
     */
    public abstract void accept(GameVisitor visitor);
}
