package com.blackj.designpattern.build.observer;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 观察者模式-具体观察者
 * <p>
 * Created by Zhang.Haixin on 2019-05-29 23:51
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Programmer implements Reader {

    private boolean available;

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void read() {
        if (available) {
            System.out.println(name + ":今天老板不再，可以偷懒看最新小说更新，真开心！");
        } else {
            System.out.println(name + ":今天只顾着改bug了都没时间看小说更新。");
        }
    }
}
