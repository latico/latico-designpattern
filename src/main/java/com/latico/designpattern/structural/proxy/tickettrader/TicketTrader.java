package com.latico.designpattern.structural.proxy.tickettrader;

/**
 * <PRE>
 * 票交易
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 20:51
 * @Version: 1.0
 */
public interface TicketTrader {

    /**
     * 买票
     */
    String buyTicket();

    /**
     * 卖票
     */
    String sellTicket();
}
