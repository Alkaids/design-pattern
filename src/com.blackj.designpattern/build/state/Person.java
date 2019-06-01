package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-环境类
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 23:02
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Person {

    private String name;

    private WeatherDress weatherDress;

    public Person(String name) {
        this.name = name;
    }

    public WeatherDress getWeatherDress() {
        return weatherDress;
    }

    public void setWeatherDress(WeatherDress weatherDress) {
        this.weatherDress = weatherDress;
    }

    public void goOutKnowTheWeather() {
        this.weatherDress.dressWear();
    }
}
