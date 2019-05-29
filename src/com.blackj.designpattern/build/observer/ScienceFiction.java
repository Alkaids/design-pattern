package com.blackj.designpattern.build.observer;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 观察者模式-具体主题
 * <p>
 * Created by Zhang.Haixin on 2019-05-29 23:33
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ScienceFiction extends Novel {

    private String novelName;

    private int chapter;

    public ScienceFiction(String novelName, int chapter) {
        this.novelName = novelName;
        this.chapter = chapter;
    }

    public void updateChapter() {
        this.chapter += 2;
        System.out.println(novelName + "今天小说更新2章！");
    }
}
