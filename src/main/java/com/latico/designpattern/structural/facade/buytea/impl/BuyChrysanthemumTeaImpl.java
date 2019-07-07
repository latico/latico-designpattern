package com.latico.designpattern.structural.facade.buytea.impl;

import com.latico.designpattern.structural.facade.buytea.BuyTea;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 23:51
 * @Version: 1.0
 */
public class BuyChrysanthemumTeaImpl implements BuyTea {
    @Override
    public void buyTea() {
        System.out.println("买的这是一杯菊花茶");
    }
}
