package com.latico.designpattern.creational.factory.abstractfactory.cat.impl.black;

import com.latico.designpattern.creational.factory.abstractfactory.cat.Cat;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:07
 * @Version: 1.0
 */
public class HomeBlackCatImpl implements Cat {
    @Override
    public void eat() {
        System.out.println("黑色家猫-吃东西");
    }
}
