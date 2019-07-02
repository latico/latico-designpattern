package com.latico.designpattern.creational.factory.factorymethod.messagefactory;

import com.latico.designpattern.creational.factory.factorymethod.message.Message;

/**
 * <PRE>
 * 接口定义，具体实现不限制
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 10:29
 * @Version: 1.0
 */
public interface MessageFactory {

    public enum MessageTypeEnum{
        EMAIL,
        SMS,
        OA
        ;
    }

    Message createMessage(MessageTypeEnum type);
}
