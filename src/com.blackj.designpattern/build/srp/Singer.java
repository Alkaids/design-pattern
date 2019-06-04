package com.blackj.designpattern.build.srp;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 单一职责原则
 * <p>
 * Created by Zhang.Haixin on 2019-06-04 23:35
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Singer implements Sing {

    @Override
    public void sing() {
        System.out.println("我是歌手，专注唱歌。");
    }
}
