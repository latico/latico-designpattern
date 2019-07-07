package com.latico.designpattern.creational.factory.abstractfactory.cat.impl.white;

import com.latico.designpattern.creational.factory.abstractfactory.cat.Cat;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 16:07
 * @Version: 1.0
 */
public class HomeWhiteCatImpl implements Cat {
    @Override
    public void eat() {
        System.out.println("白色家猫-吃东西");
    }
}
