package com.blackj.designpattern.build.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 迭代器模式-具体聚合类
 * <p>
 * Created by Zhang.Haixin on 2019-05-22 23:49
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SportsContainer implements Container {

    /**
     * 运动集合
     */
    private List<String> sports = new ArrayList<>();

    /**
     * 添加运动项
     * @param sport 运动项
     */
    public void addSport(String sport) {
        sports.add(sport);
    }

    /**
     * 删除运动项
     * @param sport 运动项
     */
    public void removeSport(String sport) {
        sports.remove(sport);
    }

    /**
     * 获取指定下标的运动
     * @param index 下标
     * @return 运动项
     */
    public Object getSport(int index) {
        return sports.get(index);
    }

    /**
     * 运动数量
     * @return 运动数量
     */
    public int size() {
        return sports.size();
    }

    @Override
    public MyIterator createIterator() {
        return new SportIterator(this);
    }
}
