package com.blackj.designpattern.build.facade;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 外观模式-具体类 电视盒子
 * <p>
 * Created by Zhang.Haixin on 2019-04-28 16:58
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class TVBox {

    /**
     * 电视播放方法
     */
    public void play() {
        System.out.println("播放电视！");
    }

    /**
     * 电视关机方法
     */
    public void display() {
        System.out.println("关闭电视！");
    }
}
