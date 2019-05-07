package com.blackj.designpattern.build.bridge;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 桥接模式-抽象化角色
 * <p>
 * Created by Zhang.Haixin on 2019-05-07 22:52
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class BaseService {

    /**
     * 实现化角色
     */
    protected BaseDao baseDao;

    /**
     * 设置具体实现化角色
     * @param baseDao
     */
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    /**
     * 抽象新增方法
     */
    public abstract void insert();

    /**
     * 抽象删除方法
     */
    public abstract void delete();

    /**
     * 抽象更新方法
     */
    public abstract  void update();

    /**
     * 抽象获取方法
     */
    public abstract  void get();
}
