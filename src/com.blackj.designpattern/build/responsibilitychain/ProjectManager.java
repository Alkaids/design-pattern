package com.blackj.designpattern.build.responsibilitychain;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 责任链模式-具体处理者（项目经理）
 * <p>
 * Created by Zhang.Haixin on 2019-05-13 23:08
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ProjectManager extends Manager{

    @Override
    public void handleLeaveRequest(float days) {
        //小于一天的请假
        if (days > 0 && days <= 1) {
            System.out.println("项目经理直接处理");
        } else {
            System.out.println("项目经理向上级申请==");
            //大于1天的请假
            if (null != getSuperior()) {
                //交给上级领导处理
                getSuperior().handleLeaveRequest(days);
            }
        }
    }
}
