package com.blackj.designpattern.build.builder;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式抽象建造者示例
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class ComputerBuilder {

    protected Computer computer = new Computer();

    public abstract void buildCPU();

    public abstract void buildHarddis();

    public abstract void buildMonitor();

    public Computer getComputer() {
        return computer;
    }
}
