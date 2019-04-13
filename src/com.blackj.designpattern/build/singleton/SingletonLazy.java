package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 单例模懒汉式
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:10
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SingletonLazy {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazy instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazy() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}