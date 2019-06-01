package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-抽象状态
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 22:51
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class WeatherDress {

    private String weatherName;

    public String getWeatherName() {
        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public WeatherDress(String weatherName) {
        this.weatherName = weatherName;
    }

    public abstract void dressWear();
}
