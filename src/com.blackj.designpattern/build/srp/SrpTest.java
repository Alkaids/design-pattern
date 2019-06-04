package com.blackj.designpattern.build.srp;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 单一职责原则
 * <p>
 * Created by Zhang.Haixin on 2019-06-04 23:37
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SrpTest {

    public static void main(String[] args) {
        Singer singer = new Singer();
        singer.sing();

        Actor actor = new Actor();
        actor.performance();
    }
}
