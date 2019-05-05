package com.blackj.designpattern.build.strategy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 策略模式-抽象策略
 * <p>
 * Created by Zhang.Haixin on 2019-05-04 23:46
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public interface DBStrategy {

    /**
     * 加载数据库的方法
     */
    void loadDB();
}
