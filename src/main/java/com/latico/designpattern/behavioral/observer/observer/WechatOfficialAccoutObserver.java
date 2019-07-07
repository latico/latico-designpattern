package com.latico.designpattern.behavioral.observer.observer;

/**
 * <PRE>
 * 微信公众号订阅者，主要是需要接收公众号的推送消息
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 14:10
 * @Version: 1.0
 */
public interface WechatOfficialAccoutObserver {

    /**
     * 订阅者名称
     * @return
     */
    String getName();

    /**
     * 接收消息
     * @param officialAccoutName 公众号名称
     * @param msg 消息内容
     */
    void receiveMsg(String officialAccoutName, String msg);

}
