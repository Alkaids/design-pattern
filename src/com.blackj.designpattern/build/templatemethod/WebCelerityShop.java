package com.blackj.designpattern.build.templatemethod;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 模板方法模式-具体子类
 * <p>
 * Created by Zhang.Haixin on 2019-05-17 23:22
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class WebCelerityShop extends Restauant {

    /**
     * 特色菜
     */
    private String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void waitTime() {
        System.out.println("网红店人气高需要排很久的队");
    }

    @Override
    public void specialtyRecommend() {
        System.out.println("今天特色菜推荐" + specialty);
    }

    @Override
    public void order() {
        System.out.println("客人进行点菜");
    }

    @Override
    public void pay() {
        System.out.println("客人用餐完成，付账");
    }

    @Override
    public void invoicing() {
        System.out.println("给客人开发票");
    }

    @Override
    public boolean needInvoice() {
        System.out.println("正规经营，给客户开发票是必须的。");
        return super.needInvoice();
    }

}
