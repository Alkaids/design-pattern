package com.blackj.designpattern.build.builder.abstrckmodel;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式 抽象产品对象
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:47
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Product {

    /**
     * 产品组成部分  可以有多个不同类型的组件构成
     */
    private String partA;

    private String partB;

    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
