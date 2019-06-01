package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-具体状态 下雨天
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 22:58
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class RainDress extends WeatherDress {

    public RainDress(String weatherName) {
        super(weatherName);
    }

    @Override
    public void dressWear() {
        System.out.println("今天的天气是：" + this.getWeatherName());
        System.out.println("需要穿雨衣或者带伞出门。");
    }
}
