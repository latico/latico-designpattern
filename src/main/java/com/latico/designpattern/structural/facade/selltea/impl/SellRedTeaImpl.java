package com.latico.designpattern.structural.facade.selltea.impl;

import com.latico.designpattern.structural.facade.selltea.SellTea;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 23:51
 * @Version: 1.0
 */
public class SellRedTeaImpl implements SellTea {
    @Override
    public void sellTea() {
        System.out.println("卖的这是一杯红茶");
    }
}
