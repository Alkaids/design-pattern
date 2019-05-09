package com.blackj.designpattern.build.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 组合模式-树枝节点
 * <p>
 * Created by Zhang.Haixin on 2019-05-09 23:48
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChildOrg extends Organization{

    /**
     * 子节点组织机构
     */
    private List<Organization> children = new ArrayList<Organization>();

    @Override
    public void add(Organization org) {
        children.add(org);
    }

    @Override
    public void remove(Organization org) {
        children.remove(org);
    }

    @Override
    public void dispaly(int index) {
        System.out.println("第" + index + "层组织机构");
        for (Organization org: children) {
            org.dispaly(index + 1);
        }
    }
}
