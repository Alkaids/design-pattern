package com.blackj.designpattern.build.adaptor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 适配器模式-电压测试用户
 * <p>
 * Created by Zhang.Haixin on 2019-04-27 23:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class VoltageUser {

    /**
     * 这里模拟的是适用电器的普通用户
     * 使用的电压不一定是220V
     * 但是通过电压适配器转换后可以正常使用电器
     */
    public static void main(String[] args) {
        //播放电视
        VoltageAdaptor televisionAdaptor = new VoltageAdaptor(new Television());
        televisionAdaptor.doPlay();

        //播放广播
        VoltageAdaptor radioAdaptor = new VoltageAdaptor(new Radio());
        radioAdaptor.doPlay();
    }
}
