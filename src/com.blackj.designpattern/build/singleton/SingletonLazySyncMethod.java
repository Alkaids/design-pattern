package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 单例模懒汉式-同步方法
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:15
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SingletonLazySyncMethod {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazySyncMethod instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazySyncMethod() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static synchronized SingletonLazySyncMethod getInstance() {
        if (instance == null) {
            instance = new SingletonLazySyncMethod();
        }
        return instance;
    }
}