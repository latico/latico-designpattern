package com.latico.designpattern.structural.proxy.dynamicproxy;

import com.latico.designpattern.structural.proxy.tickettrader.TicketTrader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <PRE>
 * 票交易，动态代理事件处理器
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 21:07
 * @Version: 1.0
 */
public class TicketTraderInvocationHandler implements InvocationHandler {

    private final TicketTrader ticketTrader;

    /**
     * 构造方法
     * @param ticketTrader 可以为空，为空的话，需要在invoke方法里面不要执行method.invoke(ticketTrader, args);
     */
    public TicketTraderInvocationHandler(TicketTrader ticketTrader){
        this.ticketTrader = ticketTrader;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("在调用真正业务方法前，动态代理打印日志检测做什么操作:" + method.getName());

        //真正执行业务方法
        Object result = null;

        //这里参考mybatis的mapper(因为根本没有写mapper的实现类)，假如没有传入被代理对象，那么不进行真正业务代码调用步骤
        if (ticketTrader != null) {

            System.out.println("动态代理开始调用真正的业务对象方法...");
            result = method.invoke(ticketTrader, args);
            System.out.println("调用业务方法后的方法返回值:" + result);

        }else{

            System.out.println("没有传入被代理对象，那么不执行真正业务方法，只执行代理内容");
        }


        System.out.println("在调用真正业务方法后，动态代理打印日志检测执行了多久:" + (System.currentTimeMillis() - startTime));
        return result;
    }
}
