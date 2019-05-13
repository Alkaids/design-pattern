package com.blackj.designpattern.build.responsibilitychain;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 责任链模式-抽象处理者
 * <p>
 * Created by Zhang.Haixin on 2019-05-13 23:03
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Manager {

    /**
     * 上级领导
     */
    private Manager superior;

    /**
     * 设置下级处理者
     * @return
     */
    public Manager getSuperior() {
        return superior;
    }

    /**
     * 获取下级处理者
     * @param superior
     */
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    /**
     * 处理请假方法
     * @param days 请假天数
     */
    public abstract void handleLeaveRequest(float days);
}
