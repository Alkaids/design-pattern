package com.blackj.designpattern.build.iterator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 迭代器模式-抽象聚合类
 * <p>
 * Created by Zhang.Haixin on 2019-05-22 23:46
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface Container {

    /**
     * 获取迭代器方法
     * @return
     */
    MyIterator createIterator();
}
