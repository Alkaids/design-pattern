package com.blackj.designpattern.build.adaptor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 适配器模式-被适配者 电视机
 * <p>
 * Created by Zhang.Haixin on 2019-04-27 22:44
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Television implements Adaptee {

    /**
     * 电视机的播放方法
     */
    @Override
    public void play() {
        System.out.println("得到可用电压220V--电视播放电视节目");
    }
}
