package com.blackj.designpattern.build.decorator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 装饰模式-具体装饰类
 * <p>
 * Created by Zhang.Haixin on 2019-05-12 22:04
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChickenLeg extends Meal {

    public ChickenLeg(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void order() {
        super.order();
        System.out.println("单点鸡腿");
    }
}
