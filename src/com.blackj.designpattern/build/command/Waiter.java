package com.blackj.designpattern.build.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 命令模式-调用者
 * <p>
 * Created by Zhang.Haixin on 2019-05-14 23:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Waiter {

    /**
     * 点菜单
     */
    private List<Meal> orderdMeals = new ArrayList<Meal>();

    /**
     * 点菜
     * @param meal
     */
    public void order(Meal meal) {
        orderdMeals.add(meal);
    }

    /**
     * 取消点菜
     * @param meal
     */
    public void cancle(Meal meal) {
        orderdMeals.remove(meal);
    }

    /**
     * 下单
     */
    public void orderMeal() {
        if (!orderdMeals.isEmpty()) {
            orderdMeals.forEach(meal -> meal.orderMeal(meal.));
        }
    }
}
