package com.blackj.designpattern.build.observer;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 观察者模式-具体观察者
 * <p>
 * Created by Zhang.Haixin on 2019-05-29 23:44
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Student implements Reader {

    private boolean available;

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void read() {
        if (available) {
            System.out.println(name + ":我有时间可以看最新小说章节，真开心！");
        } else {
            System.out.println(name + ":今天太忙了小说更新了也没时间看。");
        }
    }
}
