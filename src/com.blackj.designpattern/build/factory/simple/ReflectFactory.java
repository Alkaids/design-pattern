package com.blackj.designpattern.build.factory.simple;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 简单工厂模式-反射工厂类
 * <p>
 * Created by Zhang.Haixin on 2019-04-24 21:40
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ReflectFactory {

    /**
     * 通过具体的产品class获得具体产品的静态方法
     * @param clazz 具体的产品class
     * @return 具体产品
     */
    public static Product getProduct(Class<? extends Product> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
