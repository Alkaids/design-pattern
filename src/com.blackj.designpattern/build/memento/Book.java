package com.blackj.designpattern.build.memento;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 备忘录模式-发起人
 * <p>
 * Created by Zhang.Haixin on 2019-05-27 22:44
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Book {

    //书名
    private String name;

    //当前页码
    private int currentPage;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //插入书签
    public Bookmark createBookmark() {
        return new Bookmark(currentPage);
    }

    //取出书签阅读
    public void readFromBookmark(Bookmark bookmark) {
        this.currentPage = bookmark.getCurrentPage();
    }
}
