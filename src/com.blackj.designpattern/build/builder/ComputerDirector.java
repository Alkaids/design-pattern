package com.blackj.designpattern.build.builder;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式指挥者示例
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:23
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ComputerDirector {

    private ComputerBuilder builder;


    /**
     * 通过setter 方法注入建造者对象
     * @param builder 具体的建造者
     */
    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    /**
     * 通过构造方法注入建造者对象
     * @param builder 具体的建造者
     */
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    /**
     * 组装电脑
     * @return
     */
    public Computer construct() {
        builder.buildCPU();
        builder.buildHarddis();
        builder.buildMonitor();
        return builder.getComputer();
    }

    public ComputerDirector() {
    }
}
