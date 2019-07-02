package com.latico.designpattern.structural.proxy.staticproxy;

import com.latico.designpattern.structural.proxy.tickettrader.TicketTrader;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 20:55
 * @Version: 1.0
 */
public class StaticProxyTicketTraderImpl implements TicketTrader {

    private final TicketTrader ticketTrader;

    public StaticProxyTicketTraderImpl(TicketTrader ticketTrader){
        this.ticketTrader = ticketTrader;
    }

    @Override
    public String buyTicket() {
        long startTime = System.currentTimeMillis();
        System.out.println("在买票前静态代理给你买价建议");

        //被代理对象进行真正买票业务方法调用
        ticketTrader.buyTicket();

        System.out.println("静态代理统计你买票完成时间：" + (System.currentTimeMillis() - startTime));
        return "买票成功";
    }

    @Override
    public String sellTicket() {
        long startTime = System.currentTimeMillis();
        System.out.println("在卖票前静态代理给你卖价建议");

        //被代理对象进行真正卖票业务方法调用
        ticketTrader.sellTicket();

        System.out.println("静态代理统计你卖票完成时间：" + (System.currentTimeMillis() - startTime));
        return "卖票成功";
    }
}
