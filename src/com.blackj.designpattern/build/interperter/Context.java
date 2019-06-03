package com.blackj.designpattern.build.interperter;

import java.util.HashMap;
import java.util.Map;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 解释器模式-环境类
 * <p>
 * Created by Zhang.Haixin on 2019-06-03 23:07
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class Context {

    private Map<Expression, Integer> map = new HashMap<>();

    //定义变量
    public void add(Expression s, Integer value){
        map.put(s, value);
    }
    //将变量转换成数字
    public int lookup(Expression s){
        return map.get(s);
    }
}
