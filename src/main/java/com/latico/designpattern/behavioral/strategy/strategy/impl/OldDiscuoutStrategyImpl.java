package com.latico.designpattern.behavioral.strategy.strategy.impl;

import com.latico.designpattern.behavioral.strategy.strategy.DiscuoutStrategy;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 18:39
 * @Version: 1.0
 */
public class OldDiscuoutStrategyImpl implements DiscuoutStrategy {
    @Override
    public int discountPrice(int price) {
        System.out.println("老用户打8折");
        return Math.round(price * 0.8F);
    }
}
