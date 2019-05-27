package com.blackj.designpattern.build.memento;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 备忘录模式-备忘录
 * <p>
 * Created by Zhang.Haixin on 2019-05-27 22:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Bookmark {

    //当前页码
    private int currentPage;

    public Bookmark(int currentPage) {
        this.currentPage = currentPage;
    }

    //读取当前页码
    public int getCurrentPage() {
        return currentPage;
    }

    //保存当前页码
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
