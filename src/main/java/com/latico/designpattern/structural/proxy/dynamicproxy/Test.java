package com.latico.designpattern.structural.proxy.dynamicproxy;

import com.latico.designpattern.structural.proxy.tickettrader.TicketTrader;
import com.latico.designpattern.structural.proxy.tickettrader.impl.TicketTraderImpl;

import java.lang.reflect.Proxy;

/**
 * <PRE>
 * 动态代理，动态创建一个Class实现指定的接口的所有方法，然后调用里面的方法的时候，所有方法都会走统一的InvocationHandler里面的方法，也可以控制是否调用真正的业务执行的
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 21:17
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //因为动态代理会动态生成代理Class，指定使用哪个类加载器加载进来
        ClassLoader classLoader = TicketTrader.class.getClassLoader();

        //要代理的接口类，主要目的是获取里面的抽象方法进行代理，必须穿接口类，如果不是接口类会报错
        Class[] interfaceClasses = new Class[]{TicketTrader.class};

        //创建代理事件处理器，这里把实际业务对象传到代理事件里面，允许不传实际业务对象

        //不传实际业务对象到事件处理器的情况
//        TicketTraderInvocationHandler invocationHandler = new TicketTraderInvocationHandler(null);

        //创建实际的被代理的业务对象
        TicketTrader ticketTrader = new TicketTraderImpl();
        //传了实际业务对象到事件处理器的情况
        TicketTraderInvocationHandler invocationHandler = new TicketTraderInvocationHandler(ticketTrader);

        //创建被代理后的对象
        TicketTrader dynamicProxyImpl = (TicketTrader)Proxy.newProxyInstance(classLoader, interfaceClasses, invocationHandler);

        //用被代理后的对象进行买票和卖票
        dynamicProxyImpl.buyTicket();
        System.out.println("===============");
        dynamicProxyImpl.sellTicket();

    }
}
