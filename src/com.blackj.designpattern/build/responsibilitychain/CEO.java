package com.blackj.designpattern.build.responsibilitychain;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 责任链模式-具体处理者（总经理）
 * <p>
 * Created by Zhang.Haixin on 2019-05-13 23:18
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CEO extends Manager {

    @Override
    public void handleLeaveRequest(float days) {
        //总经理直接处理请假请求
        System.out.println("总经理权利最大，直接处理请假请求");
    }
}
