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
     * 这里用常量某配置
     */
    private final String ORACLE = "oracle";
    private final String SQLSERVER = "sqlserver";
    private final String MYSQL = "mysql";

    /**
     * 获取数据库方法
     */
    public void getDB(String datebaseName) {
        if(null == datebaseName || "".equals(datebaseName)) {
            System.out.println("没有加载数据库");
        } else if (SQLSERVER.equalsIgnoreCase(datebaseName)) {
            strategy = new SqlServerStrategy();
        } else if (ORACLE.equalsIgnoreCase(datebaseName)) {
            strategy = new OracleStrategy();
        } else if (MYSQL.equalsIgnoreCase(datebaseName)) {
            strategy = new MysqlStrategy();
        }
        strategy.loadDB();
    }
}
