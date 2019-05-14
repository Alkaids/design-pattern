package com.blackj.designpattern.build.command;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 命令模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-15 00:02
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CommandTest {

    public static void main(String[] args) {
        System.out.println("点菜==========");
        Chef chineseChef = new ChineseChef();
        Meal meal = new ChineseMeal(chineseChef);
        meal.setMeal("红烧肉");
        Waiter waiter = new Waiter();
        waiter.order(meal);

        Meal meal1 = new ChineseMeal(chineseChef);
        meal1.setMeal("鱼香肉丝");
        waiter.order(meal1);

        Meal meal2 = new ChineseMeal(chineseChef);
        meal2.setMeal("宫保鸡丁");
        waiter.order(meal2);

        Meal meal3 = new ChineseMeal(chineseChef);
        meal3.setMeal("醋溜白菜");
        waiter.order(meal3);
        System.out.println("===醋溜白菜不要了====");
        waiter.cancle(meal3);
        waiter.orderMeal();
    }
}
