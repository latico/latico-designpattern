package com.latico.designpattern.behavioral.strategy.context.impl;

import com.latico.designpattern.behavioral.strategy.context.QuoteContext;
import com.latico.designpattern.behavioral.strategy.strategy.DiscuoutStrategy;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 18:42
 * @Version: 1.0
 */
public class QuoteContextImpl implements QuoteContext {
    private DiscuoutStrategy strategy;

    @Override
    public void setDiscountStrategy(DiscuoutStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int discountStrategy(int price) {
        return strategy.discountPrice(price);
    }
}
