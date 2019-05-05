package com.blackj.designpattern.build.strategy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 策略模式-环境类
 * <p>
 * Created by Zhang.Haixin on 2019-05-04 23:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class DBContext {

    /**
     * 加载策略
     */
    private DBStrategy strategy;

    /**
     * 构造函数传入具体策略
     * @param strategy 具体策略
     */
    public DBContext(DBStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 获取数据库方法
     */
    public void getDB() {
        strategy.loadDB();
    }
}
