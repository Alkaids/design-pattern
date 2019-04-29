package com.blackj.designpattern.build.proxy;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 代理模式-代理类 代购
 * <p>
 * Created by Zhang.Haixin on 2019-04-29 23:26
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProxyUser implements Action {

    /**
     * 代购名称
     */
    public String proxyName;

    /**
     * 含有别代理对象的引用
     */
    private NormalUser user;

    /**
     * 构造函数传入需要代理的对象
     * @param proxyName 代购名称
     * @param user 被代理对象
     */
    public ProxyUser(String proxyName, NormalUser user) {
        this.proxyName = proxyName;
        this.user = user;
    }

    /**
     * 代购购买方法
     */
    @Override
    public void buy() {
        System.out.println("代购" + proxyName + "帮" + user.userName + "购买商品");
        user.buy();
    }
}
