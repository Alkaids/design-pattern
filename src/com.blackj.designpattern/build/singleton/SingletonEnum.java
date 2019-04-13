package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 静态内部类实现单例
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:37
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public enum  SingletonEnum {

    //枚举单一实例，必须是单一的，不然没法保证单例
    INSTANCE;

    //含有一个需要单例的类型的实例变量
    private Singleton instance;

    //在枚举构造函数中对单例类进行初始化，由于枚举单一实例只会初始化一次保证单例
    SingletonEnum() {
        instance = new Singleton();
    }

    /**
     * 提供静态的公共方法获取唯一实例 通过SingletonEnum.INSTANCE.getInstance() 获取单例类实例
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 单例类-需要单例的类，不需要额外处理
 */
class Singleton {

}