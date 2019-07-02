package com.latico.designpattern.structural.facade.selltea.impl;

import com.latico.designpattern.structural.facade.selltea.SellTea;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 23:51
 * @Version: 1.0
 */
public class SellChrysanthemumTeaImpl implements SellTea {
    @Override
    public void sellTea() {
        System.out.println("卖的这是一杯菊花茶");
    }
}
