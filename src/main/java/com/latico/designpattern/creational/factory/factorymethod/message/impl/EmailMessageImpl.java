package com.latico.designpattern.creational.factory.factorymethod.message.impl;

import com.latico.designpattern.creational.factory.factorymethod.message.Message;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 10:34
 * @Version: 1.0
 */
public class EmailMessageImpl implements Message {

    @Override
    public void sendMesage(String msg) {
        System.out.println("邮件消息发送:" + msg);
    }
}
