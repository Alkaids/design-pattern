package com.blackj.designpattern.build.singleton;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 单例模懒汉式-同步代码块
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:27
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SingletonLazySyncCode {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazySyncCode instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazySyncCode() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonLazySyncCode getInstance() {
        //由于判断没有在加锁过程，所以判断过程容易造成线程不安全
        if (instance == null) {
            //对类加锁，保证初始化过程的线程安全
            synchronized(SingletonLazySyncCode.class) {
                instance = new SingletonLazySyncCode();
            }
        }
        return instance;
    }
}