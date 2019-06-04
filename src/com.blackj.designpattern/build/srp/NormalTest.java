package com.blackj.designpattern.build.srp;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 单一职责原则
 * <p>
 * Created by Zhang.Haixin on 2019-06-04 23:30
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class NormalTest {

    public static void main(String[] args) {
        Genius genius = new Genius();

        genius.sing();
        genius.performance();
    }
}
