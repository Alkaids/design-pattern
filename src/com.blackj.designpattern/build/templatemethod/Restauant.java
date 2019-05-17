package com.blackj.designpattern.build.templatemethod;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 模板方法模式-抽象类
 * <p>
 * Created by Zhang.Haixin on 2019-05-17 23:09
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Restauant {

    /**
     * 排队
     */
    public abstract void waitTime();

    /**
     * 特色菜推荐
     */
    public abstract void specialtyRecommend();

    /**
     * 点餐
     */
    public abstract void order();

    /**
     * 付钱
     */
    public abstract void pay();

    /**
     * 开发票
     */
    public abstract void invoicing();

    /**
     * 是否需要发票
     * @return
     */
    public boolean needInvoice() {
        return true;
    }

    /**
     * 用餐
     */
    public final void consumptionMeal() {
        waitTime();

        specialtyRecommend();

        order();

        System.out.println("客人用餐====");

        pay();

        if (needInvoice()) {
            invoicing();
        }
    }
}