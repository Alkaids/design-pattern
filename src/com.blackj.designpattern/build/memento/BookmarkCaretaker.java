package com.blackj.designpattern.build.memento;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 备忘录模式-管理者
 * <p>
 * Created by Zhang.Haixin on 2019-05-27 22:50
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class BookmarkCaretaker {

    //书签
    private Bookmark bookmark;

    //设置书签
    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    //读取书签
    public Bookmark getBookmark() {
        return this.bookmark;
    }
}
