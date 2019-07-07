package com.latico.designpattern.structural.decorator.personbehavior.impl;

import com.latico.designpattern.structural.decorator.personbehavior.PersonBehavior;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 22:33
 * @Version: 1.0
 */
public class ManPersonBehaviorImpl implements PersonBehavior {
    @Override
    public String getType() {
        return "男生";
    }

    /**
     * 没有被修饰过的约会真正行为
     */
    @Override
    public void toDate() {
        System.out.println("男生开着车去接女生去约会");
    }
}
