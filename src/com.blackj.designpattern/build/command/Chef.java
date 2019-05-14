package com.blackj.designpattern.build.command;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 命令模式-抽象接收者
 * <p>
 * Created by Zhang.Haixin on 2019-05-14 23:41
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface Chef {

    /**
     * 炒菜方法
     * @param meal
     */
    void cookMeal(String meal);
}
