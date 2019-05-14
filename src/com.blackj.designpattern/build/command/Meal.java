package com.blackj.designpattern.build.command;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 命令模式-抽象命令
 * <p>
 * Created by Zhang.Haixin on 2019-05-14 23:37
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Meal {

    /**
     * 菜名
     */
    private String meal;

    public void setMeal(String meal) {
        this.meal = meal;
    }

    /**
     * 点餐命令
     * @param meal
     */
    public abstract void orderMeal(String meal);
}
