package com.blackj.designpattern.build.responsibilitychain;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 责任链模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-13 23:20
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChainTest {

    public static void main(String[] args) {
        Manager projectManager = new ProjectManager();
        Manager techManager = new TechManager();
        Manager ceo = new CEO();
        projectManager.setSuperior(techManager);
        techManager.setSuperior(ceo);

        System.out.println("张三向项目经理请半天假：");
        projectManager.handleLeaveRequest(0.5F);
        System.out.println();

        System.out.println("李四向项目经理请2天假：");
        projectManager.handleLeaveRequest(2);
        System.out.println();

        System.out.println("王五向项目经理请5天假");
        projectManager.handleLeaveRequest(5);
        System.out.println();

        System.out.println("小六子和项目经理关系不好，直接找总经理请2天假：");
        ceo.handleLeaveRequest(2);

    }
}
