package com.latico.designpattern.behavioral.observer.subject;

import com.latico.designpattern.behavioral.observer.observer.WechatOfficialAccoutObserver;

/**
 * <PRE>
 * 微信公众号
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 14:09
 * @Version: 1.0
 */
public interface WechatOfficialAccount {

    /**
     * 注册订阅者，添加订阅者
     * @param observer
     */
    void registerObserver(WechatOfficialAccoutObserver observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void removeObserver(WechatOfficialAccoutObserver observer);

    /**
     * 发布消息
     * @param msg
     */
    void sendMsg(String msg);
}
