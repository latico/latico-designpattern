package com.latico.designpattern.creational.factory.abstractfactory.dog.impl.black;

import com.latico.designpattern.creational.factory.abstractfactory.dog.Dog;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 16:08
 * @Version: 1.0
 */
public class HomeBlackDogImpl implements Dog {
    @Override
    public void eat() {
        System.out.println("黑色家狗-吃东西");
    }
}
