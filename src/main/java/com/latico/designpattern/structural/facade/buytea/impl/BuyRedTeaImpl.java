package com.latico.designpattern.structural.facade.buytea.impl;

import com.latico.designpattern.structural.facade.buytea.BuyTea;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 23:51
 * @Version: 1.0
 */
public class BuyRedTeaImpl implements BuyTea {
    @Override
    public void buyTea() {
        System.out.println("买的这是一杯红茶");
    }
}
