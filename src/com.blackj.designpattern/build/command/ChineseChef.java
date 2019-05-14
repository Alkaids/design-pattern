package com.blackj.designpattern.build.command;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 命令模式-接收者
 * <p>
 * Created by Zhang.Haixin on 2019-05-14 23:43
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChineseChef implements Chef {

    @Override
    public void cookMeal(String meal) {
        System.out.println("中餐大厨炒" + meal);
    }
}
