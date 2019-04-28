package com.blackj.designpattern.build.facade;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 外观模式-具体类 空调类
 * <p>
 * Created by Zhang.Haixin on 2019-04-28 16:55
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Conditioner {

    /**
     * 打开空调方法
     */
    public void onAir() {
        System.out.println("打开空调！");
    }

    /**
     * 关闭空调方法
     */
    public void offAir() {
        System.out.println("关闭空调");
    }
}
