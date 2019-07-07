package com.latico.designpattern.creational.prototype.personprototype.impl;

import com.latico.designpattern.creational.prototype.personprototype.PersonPrototype;

/**
 * <PRE>
 *  具体的类
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 17:52:03
 * @Version: 1.0
 */
public class WomanPersonPrototypeImpl extends PersonPrototype {

    @Override
    public void doSomething(String something) {
        System.out.println("女人做某事:" + something);
    }
}
