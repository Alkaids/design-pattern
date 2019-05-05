package com.blackj.designpattern.build.strategy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 策略模式-具体策略
 * <p>
 * Created by Zhang.Haixin on 2019-05-04 23:50
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class OracleStrategy implements DBStrategy{

    /**
     * oracle 加载数据库方法
     */
    @Override
    public void loadDB() {
        System.out.println("加载oracle 数据库完成");
    }
}
