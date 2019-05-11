package com.blackj.designpattern.build.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 享元模式-享元工厂
 * <p>
 * Created by Zhang.Haixin on 2019-05-11 22:17
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class ChargeBoxFactory {

    private static ConcurrentHashMap<String, ChargeBox> allChargeBox = new ConcurrentHashMap<String, ChargeBox>();

    public static ChargeBox getChargeBox(String brand, String user) {

        if (allChargeBox.get(brand) == null) {

            synchronized (allChargeBox) {

                if (allChargeBox.get(brand) == null) {

                    if (brand.equalsIgnoreCase("monster")) {
                        ChargeBox monster = new MonsterChargeBox(user);
                        allChargeBox.put(brand, monster);
                    } else if (brand.equalsIgnoreCase("mi")) {
                        ChargeBox mi = new MiChargeBox(user);
                        allChargeBox.put(brand, mi);
                    }
                }
            }
        }
        return allChargeBox.get(brand);
    }
}
