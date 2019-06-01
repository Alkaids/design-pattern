package com.blackj.designpattern.build.state;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 状态模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-06-01 23:07
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class StateTest {

    public static void main(String[] args) {
        Person person = new Person("张三");

        person.setWeatherDress(new SnowDress("晴天"));
        person.goOutKnowTheWeather();

        System.out.println("=======another day=====");

        person.setWeatherDress(new RainDress("下雨"));
        person.goOutKnowTheWeather();

        System.out.println("=======another day=====");
        person.setWeatherDress(new WindDress("刮风"));
        person.goOutKnowTheWeather();
    }
}
