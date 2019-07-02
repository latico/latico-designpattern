package com.latico.designpattern.behavioral.strategy.strategy;

/**
 * <PRE>
 * 打折策略
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 18:38
 * @Version: 1.0
 */
public interface DiscuoutStrategy {

    /**
     * 打折价格
     * @param price 原价格
     * @return 打折后的价格
     */
    int discountPrice(int price);
}
