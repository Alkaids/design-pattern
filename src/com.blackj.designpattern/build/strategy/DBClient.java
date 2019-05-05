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

        DBContext context = new DBContext();

        //加载mysql
        context.getDB("mysql");
        System.out.println();

        //加载sqlserver
        context.getDB("sqlserver");
        System.out.println();

        //加载oracle
        context.getDB("oracle");
    }
}
