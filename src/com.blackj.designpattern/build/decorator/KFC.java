package com.blackj.designpattern.build.decorator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 装饰模式-具体构件
 * <p>
 * Created by Zhang.Haixin on 2019-05-12 21:53
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class KFC implements Restaurant {

    /**
     * 套餐
     */
    private String meal;

    public KFC() {
    }

    public KFC(String meal) {
        this.meal = meal;
    }

    @Override
    public void order() {
        System.out.println("在肯德基进行点餐：");
        if (null != meal) {
            if (meal.equalsIgnoreCase("a")) {
                hamburgAndChickenLeg();
            } else if (meal.equalsIgnoreCase("b")) {
                hamburgAndChickenWing();
            }
        }
    }

    public void hamburgAndChickenLeg() {
        System.out.println("套餐A：汉堡鸡腿套餐");
    }

    public void hamburgAndChickenWing() {
        System.out.println("套餐B：汉堡鸡翅套餐");
    }
}
