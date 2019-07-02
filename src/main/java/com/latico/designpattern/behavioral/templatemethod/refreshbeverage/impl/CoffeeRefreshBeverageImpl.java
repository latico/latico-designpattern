package com.latico.designpattern.behavioral.templatemethod.refreshbeverage.impl;

import com.latico.designpattern.behavioral.templatemethod.refreshbeverage.AbstractRefreshBeverage;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 22:02
 * @Version: 1.0
 */
public class CoffeeRefreshBeverageImpl extends AbstractRefreshBeverage {
    @Override
    protected void brewBeverage() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected boolean isAddseasoner() {
        System.out.println("咖啡需要加调味料，味道会更好");
        return true;
    }

    @Override
    protected void addSeasoner() {
        System.out.println("加糖");
    }
}
