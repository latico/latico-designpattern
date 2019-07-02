package com.latico.designpattern.creational.factory.abstractfactory.dog.impl.white;

import com.latico.designpattern.creational.factory.abstractfactory.dog.Dog;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:08
 * @Version: 1.0
 */
public class HomeWhiteDogImpl implements Dog {
    @Override
    public void eat() {
        System.out.println("白色家狗-吃东西");
    }
}
