package com.latico.designpattern.creational.factory.factorymethod.messagefactory.impl;

import com.latico.designpattern.creational.factory.factorymethod.message.Message;
import com.latico.designpattern.creational.factory.factorymethod.message.impl.EmailMessageImpl;
import com.latico.designpattern.creational.factory.factorymethod.message.impl.OaMessageImpl;
import com.latico.designpattern.creational.factory.factorymethod.message.impl.SmsMessageImpl;
import com.latico.designpattern.creational.factory.factorymethod.messagefactory.MessageFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 10:29
 * @Version: 1.0
 */
public class MessageFactoryImpl implements MessageFactory {

    private static final Map<MessageTypeEnum, Class<? extends Message>> messageImplMap = new HashMap<>();
    static {
        messageImplMap.put(MessageTypeEnum.EMAIL, EmailMessageImpl.class);
        messageImplMap.put(MessageTypeEnum.SMS, SmsMessageImpl.class);
        messageImplMap.put(MessageTypeEnum.OA, OaMessageImpl.class);
    }

    @Override
    public Message createMessage(MessageTypeEnum type) {
        try {
            return messageImplMap.get(type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
