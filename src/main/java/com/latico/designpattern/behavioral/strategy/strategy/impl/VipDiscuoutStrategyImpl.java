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
public class VipDiscuoutStrategyImpl implements DiscuoutStrategy {
    @Override
    public int discountPrice(int price) {
        System.out.println("VIP用户打6折");
        return Math.round(price * 0.6F);
    }
}
