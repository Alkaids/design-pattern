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
public class ObsrverTest {

    public static void main(String[] args) {
        ScienceFiction santi = new ScienceFiction("《三体》", 100);

        santi.addReader(new Student("张三"));
        santi.addReader(new Programmer("李四"));

        santi.updateChapter();
        santi.notifyReaders();
    }
}
