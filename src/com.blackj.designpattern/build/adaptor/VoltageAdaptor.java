package com.blackj.designpattern.build.adaptor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 适配器模式-适配器
 * <p>
 * Created by Zhang.Haixin on 2019-04-27 22:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class VoltageAdaptor {

    /**
     * 私有的被适配者对象
     */
    private Adaptee adaptee;

    /**
     * 构造函数传入适配者对象
     * @param adaptee 被适配者对象
     */
    public VoltageAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 转换电压并执行电器播放方法
     */
    public void doPlay() {
        System.out.println("进行电压转化--得到220V可用电压");
        adaptee.play();
    }
}
