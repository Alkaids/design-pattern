package com.blackj.designpattern.build.command;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 命令模式-具体命令
 * <p>
 * Created by Zhang.Haixin on 2019-05-14 23:39
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChineseMeal extends Meal {

    /**
     * 大厨
     */
    private Chef chef;

    public ChineseMeal(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderMeal(String meal) {
        System.out.println("客人点了" + meal);
        chef.cookMeal(meal);
    }
}
