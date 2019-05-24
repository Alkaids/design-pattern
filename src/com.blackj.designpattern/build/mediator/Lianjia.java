package com.blackj.designpattern.build.mediator;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 中介者模式-具体中介
 * <p>
 * Created by Zhang.Haixin on 2019-05-24 00:24
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Lianjia implements HouseMediator {

    /**
     * 房主
     */
    private HouseOwner owner;

    /**
     * 租户
     */
    private Tenant tenant;

    private final String CHEAP_HOUSE = "单身公寓";

    private final String EXPENSIVE_HOUSE = "洋房";


    public void setOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void sendMessage(String message, People people) {
        if (people == owner) {
            System.out.println("房主发布消息");
            people.action(message);
            if (message.contains(EXPENSIVE_HOUSE)) {
                tenant.action("我没钱，租不起洋房！");
            } else if (message.contains(CHEAP_HOUSE)) {
                tenant.action("这单身公寓不错，可以先去看看吗？");
            }
        } else if (people == tenant) {
            System.out.println("租户提供需求");
            people.action(message);
            if (message.contains(EXPENSIVE_HOUSE)) {
                owner.action("欢迎来我的房子查看，环境舒适，家具齐全，绝对适合您！");
            } else if (message.contains(CHEAP_HOUSE)) {
                owner.action("没钱还想租啥好房子啊，自己去看看地下室吧！");
            }
        }
    }
}
