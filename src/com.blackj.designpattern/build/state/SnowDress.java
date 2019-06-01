package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-具体状态 下雪天气
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 23:00
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SnowDress extends WeatherDress {

    public SnowDress(String weatherName) {
        super(weatherName);
    }

    @Override
    public void dressWear() {
        System.out.println("今天的天气是：" + this.getWeatherName());
        System.out.println("需要穿羽绒服或大衣出门。");
    }
}
