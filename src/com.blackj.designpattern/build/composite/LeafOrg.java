package com.blackj.designpattern.build.composite;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 组合模式-叶子节点
 * <p>
 * Created by Zhang.Haixin on 2019-05-09 23:55
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class LeafOrg extends Organization {

    @Override
    public void add(Organization org) {
        System.out.println("叶子组织节点没有添加实现");
    }

    @Override
    public void remove(Organization org) {
        System.out.println("叶子组织节点没有移除实现");
    }

    @Override
    public void dispaly(int index) {
        System.out.println("第" + index + "层组织机构");
    }
}
