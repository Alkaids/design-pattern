package com.blackj.designpattern.build.observer;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 观察者模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-29 23:51
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ObserverTest {

    public static void main(String[] args) {
        ScienceFiction santi = new ScienceFiction("《三体》", 100);

        Student zhang = new Student("张三");
        zhang.setAvailable(true);
        santi.addReader(zhang);
        Programmer li = new Programmer("李四");
        li.setAvailable(false);
        santi.addReader(li);

        santi.updateChapter();
        santi.notifyReaders();

        System.out.println("====又过了一天====");
        Programmer wang = new Programmer("王五");
        wang.setAvailable(true);
        santi.addReader(wang);
        santi.updateChapter();
        santi.notifyReaders();
    }
}
