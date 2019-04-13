package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 单例模懒汉式-双重锁模式
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:24
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SingletonLazyDoubleCheck {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazyDoubleCheck instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazyDoubleCheck() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonLazyDoubleCheck getInstance() {
        //由于判断没有在加锁过程，所以判断过程容易造成线程不安全
        if (instance == null) {
            //对类加锁，保证初始化过程的线程安全
            synchronized(SingletonLazyDoubleCheck.class) {
                //双重判断 保证多线程环境下的实例单一性
                if (instance == null) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}