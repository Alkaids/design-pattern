package com.blackj.designpattern.build.iterator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 迭代器模式-抽象迭代器
 * <p>
 * Created by Zhang.Haixin on 2019-05-22 23:40
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface MyIterator {

    /**
     * 是否有下一个
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个
     * @return
     */
    Object next();
}
