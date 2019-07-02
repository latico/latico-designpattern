package com.latico.designpattern.structural.proxy.tickettrader.impl;

import com.latico.designpattern.structural.proxy.tickettrader.TicketTrader;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 20:54
 * @Version: 1.0
 */
public class TicketTraderImpl implements TicketTrader {
    @Override
    public String buyTicket() {
        System.out.println("去买票...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return "买票成功";
    }

    @Override
    public String sellTicket() {
        System.out.println("去卖票...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return "卖票成功";
    }
}
