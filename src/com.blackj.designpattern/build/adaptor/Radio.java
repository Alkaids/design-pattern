package com.blackj.designpattern.build.adaptor;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 适配器模式-被适配者 广播电台
 * <p>
 * Created by Zhang.Haixin on 2019-04-27 22:54
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Radio implements Adaptee {

    /**
     * 广播电台的播放方法
     */
    @Override
    public void play() {
        System.out.println("得到220V可用电压--电台播放音乐广播");
    }
}
