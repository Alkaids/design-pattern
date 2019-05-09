package com.blackj.designpattern.build.composite;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 组合模式-抽象节点
 * <p>
 * Created by Zhang.Haixin on 2019-05-09 23:44
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Organization {

    /**
     * 抽象添加方法
     */
    public abstract void add(Organization org);

    /**
     * 抽象删除方法
     */
    public abstract void remove(Organization org);

    /**
     * 抽象展示方法
     */
    public abstract void dispaly(int index);
}
