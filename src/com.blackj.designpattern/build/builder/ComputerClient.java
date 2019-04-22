package com.blackj.designpattern.build.builder;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 建造者模式电脑示例
 * <p>
 * Created by Zhang.Haixin on 2019-04-22 23:30
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ComputerClient {

    public static void main(String[] args) {

        ComputerBuilder desktopBuilder = new DesktopComputerBuilder();
        ComputerDirector director = new ComputerDirector(desktopBuilder);
        Computer desktop = director.construct();
        System.out.println(desktop.getComputerInfo());

        ComputerBuilder laptopBuilder = new LaptopComputerBuilder();
        director.setBuilder(laptopBuilder);
        Computer laptop =  director.construct();
        System.out.println(laptop.getComputerInfo());

    }
}
