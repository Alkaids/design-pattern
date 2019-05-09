package com.blackj.designpattern.build.composite;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 组合模式-测试
 * <p>
 * Created by Zhang.Haixin on 2019-05-09 23:58
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class CompositeTest {

    public static void main(String[] args) {
        String rootName = "根组织";
        Organization root = new ChildOrg(rootName);

        String firstOrgName = "一级组织";
        Organization first = new ChildOrg(firstOrgName);

        String secondOrgName = "二级组织";
        Organization second = new ChildOrg(secondOrgName);

        String nextOrgName = "一级同级组织";
        Organization nextOrg = new ChildOrg(nextOrgName);

        String nextSecondName = "二级同级组织";
        Organization nextSecond = new ChildOrg(nextSecondName);

        root.add(first);
        first.add(second);
        root.add(nextOrg);
        nextOrg.add(nextSecond);

        root.dispaly(1);
    }
}
