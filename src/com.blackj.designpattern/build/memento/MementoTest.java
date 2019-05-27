package com.blackj.designpattern.build.memento;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 备忘录模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-27 23:01
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class MementoTest {

    public static void main(String[] args) {

        Book book = new Book();
        book.setName("《设计模式》");
        System.out.println("开始阅读：" + book.getName());
        book.setCurrentPage(35);

        BookmarkCaretaker bookmarkCaretaker = new BookmarkCaretaker();
        System.out.println("今天就阅读到" + book.getCurrentPage() + "页");
        bookmarkCaretaker.setBookmark(book.createBookmark());
        System.out.print("合上书，");
        book.setCurrentPage(0);
        System.out.println("当前页码为：" + book.getCurrentPage() + "页");
        System.out.println("------------------");

        System.out.println("第二天继续阅读");
        book.readFromBookmark(bookmarkCaretaker.getBookmark());
        System.out.println("从第" + book.getCurrentPage() + "页开始阅读");
    }
}
