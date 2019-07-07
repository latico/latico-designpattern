package com.latico.designpattern.behavioral.observer.observer;

/**
 * <PRE>
 * 实现观察者，同时进行功能增强
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 14:57
 * @Version: 1.0
 */
public interface WechatOfficialAccoutReader extends WechatOfficialAccoutObserver {
    /**
     * 从信箱读取第一条消息
     * @return
     */
    public String readFirstMsgFromBox();
}
