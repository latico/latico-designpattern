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
public class TeaRefreshBeverageImpl extends AbstractRefreshBeverage {
    @Override
    protected void brewBeverage() {
        System.out.println("用沸水冲泡茶");
    }

    @Override
    protected boolean isAddseasoner() {
        System.out.println("茶不加调味料，要喝出原汁原味");
        return false;
    }

    @Override
    protected void addSeasoner() {
        System.out.println("加糖和牛奶");
    }
}
