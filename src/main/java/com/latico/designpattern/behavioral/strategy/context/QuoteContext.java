package com.latico.designpattern.behavioral.strategy.context;

import com.latico.designpattern.behavioral.strategy.strategy.DiscuoutStrategy;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 18:35
 * @Version: 1.0
 */
public interface QuoteContext {

    /**
     * 设置当前的打折策略
     * @param strategy
     */
    void setDiscountStrategy(DiscuoutStrategy strategy);

    /**
     * 打折策略，策略模式提供的业务接口，打折后的价格
     * @param price 原价格
     * @return
     */
    int discountStrategy(int price);

}
