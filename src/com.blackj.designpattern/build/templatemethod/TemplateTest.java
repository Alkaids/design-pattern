package com.blackj.designpattern.build.templatemethod;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 模板方法模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-17 23:38
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class TemplateTest {

    public static void main(String[] args) {
        WebCelerityShop webCelerityShop = new WebCelerityShop();
        webCelerityShop.setSpecialty("特色红烧肉");

        webCelerityShop.consumptionMeal();
    }
}
