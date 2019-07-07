package com.latico.designpattern.behavioral.observer.subject.impl;

import com.latico.designpattern.behavioral.observer.observer.WechatOfficialAccoutObserver;
import com.latico.designpattern.behavioral.observer.subject.WechatOfficialAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 14:26
 * @Version: 1.0
 */
public class WechatOfficialAccountImpl implements WechatOfficialAccount {

    /**
     * 公众号名称
     */
    private final String officialAccountName;

    public WechatOfficialAccountImpl(String officialAccountName) {
        this.officialAccountName = officialAccountName;
        this.observers = new ArrayList<>();
    }
    /**
     * 订阅的观察者
     */
    private List<WechatOfficialAccoutObserver> observers;

    @Override
    public void registerObserver(WechatOfficialAccoutObserver observer) {
        System.out.println(observer.getName() + ":订阅了:" + officialAccountName);
        observers.add(observer);
    }

    @Override
    public void removeObserver(WechatOfficialAccoutObserver observer) {
        System.out.println(observer.getName() + ":取消订阅:" + officialAccountName);
        observers.remove(observer);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(officialAccountName + ":发布了:" + msg);
        for (WechatOfficialAccoutObserver observer : observers) {
            observer.receiveMsg(officialAccountName, msg);
        }
    }
}
