package com.blackj.designpattern.build.builder.abstrckmodel;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式 抽象建造者对象
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:49
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Builder {

    protected Product product=new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult()
    {
        return product;
    }
}
