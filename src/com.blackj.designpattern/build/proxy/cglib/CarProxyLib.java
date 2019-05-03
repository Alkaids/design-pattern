package com.blackj.designpattern.build.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-动态代理 代理库
 * <p>
 * Created by Zhang.Haixin on 2019-05-02 23:14
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CarProxyLib implements MethodInterceptor {

    /**
     * 要代理的真实对象
     */
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target 目标对象
     * @return 代理对象
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(this.target.getClass());
        // 设置单一回调对象，在调用中拦截对目标方法的调用
        enhancer.setCallback(this);
        //设置类加载器
        enhancer.setClassLoader(this.target.getClass().getClassLoader());
        // 创建代理对象
        return enhancer.create();
    }

    /**
     * 拦截对目标方法的调用
     * @param o 代理对象
     * @param method 拦截的方法
     * @param args 拦截的方法参数
     * @param methodProxy 代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");
        methodProxy.invokeSuper(o, args);
        System.out.println("代理结束");
        return null;
    }
}
