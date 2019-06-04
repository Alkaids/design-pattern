package com.blackj.designpattern.build.srp;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 单一职责原则
 * <p>
 * Created by Zhang.Haixin on 2019-06-04 23:27
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Genius implements Sing, Performance{

    @Override
    public void performance() {
        System.out.println("我是天才，我会表演");
    }

    @Override
    public void sing() {
        System.out.println("我是天才，我会唱歌");
    }
}
