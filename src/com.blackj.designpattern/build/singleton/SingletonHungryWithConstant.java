package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 单例模式饿汉式-常量式
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 16:50
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
pulic class SingletonHungryWithConstant {

    /**
     * 提供静态的不可修改的唯一实例常量
     */
    private final static SingletonHungryWithConstant INSTANCE = new SingletonHungryWithConstant();

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonHungryWithConstant() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonHungryWithConstant getInstance() {
        return INSTANCE;
    }
}