package com.blackj.designpattern.build.sigleton;

/**
 * Program Name: java-basic
 * <p>
 * Description: 静态内部类实现单例
 * <p>
 * Created by Zhang.Haixin on 2019/04/13 17:32
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SingletonInnerClass {

    /**
     * 提供唯一实例变量
     */
    private SingletonInnerClass instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonInnerClass() {
    }

    /**
     * 静态内部类，保证线程安全，懒加载实现初始化实例
     */
    private class SingletonInnerClassInstance {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonInnerClass getInstance() {
        return SingletonInnerClassInstance.INSTANCE;
    }
}