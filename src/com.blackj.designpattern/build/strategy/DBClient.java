package com.blackj.designpattern.build.strategy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 策略模式-测试类
 * <p>
 * Created by Zhang.Haixin on 2019-05-05 00:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class DBClient {

    public static void main(String[] args) {
        //加载mysql
        DBStrategy mysql = new MysqlStrategy();
        DBContext mysqlContext = new DBContext(mysql);
        mysqlContext.getDB();
        System.out.println();

        //加载sqlserver
        DBStrategy sqlserver = new SqlServerStrategy();
        DBContext sqlserverContext = new DBContext(sqlserver);
        sqlserverContext.getDB();
        System.out.println();

        //加载oracle
        DBStrategy oracle = new OracleStrategy();
        DBContext oracleContext = new DBContext(oracle);
        oracleContext.getDB();
    }
}
