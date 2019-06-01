package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-具体状态 刮风天气
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 22:56
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class WindDress extends WeatherDress {

    public WindDress(String weatherName) {
        super(weatherName);
    }

    @Override
    public void dressWear() {
        System.out.println("今天的天气是：" + this.getWeatherName());
        System.out.println("需要披一个外套出门。");
    }
}
