package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 单例模式饿汉式-静态代码块
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
pulic class SingletonHungryWithStaticCode {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonHungryWithStaticCode instance;

    /**
     * 通过静态代码块在类加载过程进行初始化
     */
    static {
        instance = new SingletonHungryWithStaticCode();
    }

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonHungryWithStaticCode() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonHungryWithStaticCode getInstance() {
        return INSTANCE;
    }
}