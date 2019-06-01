package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-具体状态 晴天穿着
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 22:53
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class SunnyDress extends WeatherDress {

    public SunnyDress(String weatherName) {
        super(weatherName);
    }

    @Override
    public void dressWear() {
        System.out.println("今天的天气是：" + this.getWeatherName());
        System.out.println("穿短袖T恤出门就好。");
    }
}
