package com.blackj.designpattern.build.decorator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 装饰模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-12 22:06
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Restaurant kfc = new KFC();

        Restaurant meal = new Hamburger(kfc);
        meal.order();

        System.out.println();
        Restaurant kfcMeal = new KFC("a");
        kfcMeal.order();

    }
}
