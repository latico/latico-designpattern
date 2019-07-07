package com.latico.designpattern.behavioral.strategy;

import com.latico.designpattern.behavioral.strategy.context.QuoteContext;
import com.latico.designpattern.behavioral.strategy.context.impl.QuoteContextImpl;
import com.latico.designpattern.behavioral.strategy.strategy.DiscuoutStrategy;
import com.latico.designpattern.behavioral.strategy.strategy.impl.NewDiscuoutStrategyImpl;
import com.latico.designpattern.behavioral.strategy.strategy.impl.OldDiscuoutStrategyImpl;
import com.latico.designpattern.behavioral.strategy.strategy.impl.VipDiscuoutStrategyImpl;

/**
 * <PRE>
 * 策略模式跟工厂模式的区别是：工厂模式只是仅仅帮忙生产对象，并不封装任何逻辑方法，
 * 而策略模式，主要目的是替代if else代码，具体使用的实现类是通过外面传进来，
 * 当新增策略也不需要修改上下文类，然后提供统一的业务接口，
 * 客户端只负责策略传入上下文中和使用上下文进行业务方法调用。
 *
 * 当有新的策略进来，不会对以前的代码造成影响，而工厂模式需要修改工厂类增加枚举和实现类的映射
 *
 * 场景示例：
 * VIP用户打6折、老用户8折、新用户9折
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 18:32
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //上下文统一业务接口，负责给客户端使用，内部控制策略的使用
        QuoteContext context = new QuoteContextImpl();

        //在这里创建具体的策略
        DiscuoutStrategy strategy = new VipDiscuoutStrategyImpl();

        //把策略传入上下文
        context.setDiscountStrategy(strategy);

        //通过上下文进行调用业务方法，而不是通过直接跟具体策略交互，打折后的价格
        System.out.println(context.discountStrategy(1000));

        //老用户
        strategy = new OldDiscuoutStrategyImpl();
        context.setDiscountStrategy(strategy);
        System.out.println(context.discountStrategy(1000));

        //新用户
        strategy = new NewDiscuoutStrategyImpl();
        context.setDiscountStrategy(strategy);
        System.out.println(context.discountStrategy(1000));
    }
}
