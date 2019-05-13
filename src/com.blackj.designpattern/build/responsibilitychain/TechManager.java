package com.blackj.designpattern.build.responsibilitychain;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 责任链模式-具体处理者（技术总监）
 * <p>
 * Created by Zhang.Haixin on 2019-05-13 23:15
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class TechManager extends Manager {

    @Override
    public void handleLeaveRequest(float days) {
        //3天以内的请假技术总监有权处理
        if (days > 0 && days <= 3) {
            System.out.println("技术总监处理请假");
        } else {
            System.out.println("技术总监向上级申请==");
            //大于3天的请假
            if (null != getSuperior()) {
                //上级领导处理
                getSuperior().handleLeaveRequest(days);
            }
        }
    }
}
