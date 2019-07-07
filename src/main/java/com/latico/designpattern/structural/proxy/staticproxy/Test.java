package com.latico.designpattern.structural.proxy.staticproxy;

import com.latico.designpattern.structural.proxy.tickettrader.TicketTrader;
import com.latico.designpattern.structural.proxy.tickettrader.impl.TicketTraderImpl;

/**
 * <PRE>
 * 静态代理，每个方法都要复写一边，调用真正的业务执行者
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 21:01
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //先创建一个实现对象
        TicketTrader ticketTraderImpl = new TicketTraderImpl();

        //把实现对象传入静态代理
        TicketTrader staticProxyImpl = new StaticProxyTicketTraderImpl(ticketTraderImpl);

        //用静态代理去买票和卖票
        staticProxyImpl.buyTicket();
        System.out.println("======================");
        staticProxyImpl.sellTicket();

    }
}
