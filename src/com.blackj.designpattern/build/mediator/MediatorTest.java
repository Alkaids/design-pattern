package com.blackj.designpattern.build.mediator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 中介者模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-24 00:30
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class MediatorTest {

    public static void main(String[] args) {
        Lianjia lianjia = new Lianjia();

        HouseOwner owner = new HouseOwner(lianjia, "张三");
        Tenant tenant = new Tenant(lianjia, "小明");

        lianjia.setOwner(owner);
        lianjia.setTenant(tenant);

        owner.send("我有一套海景洋房出租！");
        tenant.send("我想租一套便宜的单身公寓！");
    }
}
