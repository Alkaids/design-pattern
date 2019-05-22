package com.blackj.designpattern.build.iterator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 迭代器模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-23 00:05
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class IteratorTest {

    public static void main(String[] args) {
        SportsContainer container = new SportsContainer();

        container.addSport("basketball");
        container.addSport("pingpong");
        container.addSport("swimming");
        container.addSport("baseball");

        MyIterator iterator = container.createIterator();
        System.out.println("遍历运动项：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
