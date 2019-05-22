package com.blackj.designpattern.build.iterator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 迭代器模式-具体迭代器
 * <p>
 * Created by Zhang.Haixin on 2019-05-22 23:54
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SportIterator implements MyIterator {

    /**
     * 运动集合
     */
    private SportsContainer sports;

    /**
     * 查询下标
     */
    private int index;

    /**
     * 构造函数传入运动集合
     * @param sports
     */
    public SportIterator(SportsContainer sports) {
        this.sports = sports;
    }

    @Override
    public boolean hasNext() {
        if(index < sports.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return sports.getSport(index++);
        }
        return null;
    }
}
