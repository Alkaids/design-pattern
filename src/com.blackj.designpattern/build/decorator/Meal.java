package com.blackj.designpattern.build.decorator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 装饰模式-抽象装饰类
 * <p>
 * Created by Zhang.Haixin on 2019-05-12 21:49
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Meal implements Restaurant {

    /**
     * 含有抽象构件的实例
     */
    private Restaurant restaurant;

    public Meal(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void order() {
        if (null != restaurant) {
            restaurant.order();
        }
    }
}
