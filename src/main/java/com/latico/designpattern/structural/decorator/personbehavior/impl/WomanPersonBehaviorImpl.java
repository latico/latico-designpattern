package com.latico.designpattern.structural.decorator.personbehavior.impl;

import com.latico.designpattern.structural.decorator.personbehavior.PersonBehavior;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 22:33
 * @Version: 1.0
 */
public class WomanPersonBehaviorImpl implements PersonBehavior {
    @Override
    public String getType() {
        return "女生";
    }

    /**
     * 没有被修饰过的约会真正行为
     */
    @Override
    public void toDate() {
        System.out.println("女生等待男生开车来接去约会");
    }
}
