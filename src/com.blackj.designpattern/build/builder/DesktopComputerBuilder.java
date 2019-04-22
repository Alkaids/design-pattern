package com.blackj.designpattern.build.builder;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式具体建造者-台式电脑建造者示例
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:13
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class DesktopComputerBuilder extends ComputerBuilder {

    @Override
    public void buildCPU() {
        computer.setCpu("台式电脑 CPU");
    }

    @Override
    public void buildHarddis() {
        computer.setHarddisk("台式电脑硬盘");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("台式电脑显示起");
    }
}
