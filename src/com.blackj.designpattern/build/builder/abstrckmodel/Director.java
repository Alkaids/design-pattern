package com.blackj.designpattern.build.builder.abstrckmodel;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式 抽象指挥者对象
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:53
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Director {

    private Builder builder;

    /**
     * 通过setter 方法注入建造者对象
     * @param builder 具体的建造者
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director() {
    }

    /**
     * 通过构造方法注入建造者对象
     * @param builder 具体的建造者
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装产品
     * @return
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
