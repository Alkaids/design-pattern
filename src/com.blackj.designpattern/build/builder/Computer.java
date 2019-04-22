package com.blackj.designpattern.build.builder;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式具体产品示例
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 22:38
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Computer {

    private String cpu;

    private String harddisk;

    private String monitor;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getComputerInfo() {
        return "Computer: { cpu: " + this.cpu + ", harddisk： " +  this.harddisk + ", monitor: " + this.monitor + "}";
    }
}
