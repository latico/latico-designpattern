package com.latico.designpattern.behavioral.observer;

import com.latico.designpattern.behavioral.observer.observer.WechatOfficialAccoutReader;
import com.latico.designpattern.behavioral.observer.observer.impl.UserWechatOfficialAccoutReaderImpl;
import com.latico.designpattern.behavioral.observer.subject.WechatOfficialAccount;
import com.latico.designpattern.behavioral.observer.subject.impl.WechatOfficialAccountImpl;

/**
 * <PRE>
 *     观察者模式
 *  回调函数是观察者模式的一种实现
 * 场景：用户订阅了公众号，当公众号发消息后，所有订阅者会收到并存储到信箱中，订阅者可以从里面读取，
 *
 * apache的文件夹文件监听器，就是使用了观察者模式
 * JDK的事件监听器
 * Spring的事件监听器
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 14:32
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //创建两个公众号，一个技术交流平台，一个新闻平台
        WechatOfficialAccount itWechatOfficialAccount = new WechatOfficialAccountImpl("IT技术平台");
        WechatOfficialAccount worldNewsWechatOfficialAccount = new WechatOfficialAccountImpl("国际新闻平台");

        //创建订阅者，使用读者接口，目的是增强了订阅者，支持主动读取消息
        WechatOfficialAccoutReader xiaomingObserver = new UserWechatOfficialAccoutReaderImpl("小明");
        WechatOfficialAccoutReader xiaohongObserver = new UserWechatOfficialAccoutReaderImpl("小红");

        //小明两个公众号都把订阅，小红是女生不订阅IT技术公众号
        itWechatOfficialAccount.registerObserver(xiaomingObserver);
        worldNewsWechatOfficialAccount.registerObserver(xiaomingObserver);
        worldNewsWechatOfficialAccount.registerObserver(xiaohongObserver);

        //IT技术公众号发布消息
        itWechatOfficialAccount.sendMsg("设计模式出新技术了");

        //国际新闻公众号发布消息
        worldNewsWechatOfficialAccount.sendMsg("中美两个贸易谈判");
        System.out.println("=======================");

        //小明从信箱主动读取消息
        xiaomingObserver.readFirstMsgFromBox();
        xiaomingObserver.readFirstMsgFromBox();
        xiaomingObserver.readFirstMsgFromBox();

        //小红从信箱主动读取消息
        xiaohongObserver.readFirstMsgFromBox();
        xiaohongObserver.readFirstMsgFromBox();
        xiaohongObserver.readFirstMsgFromBox();

    }
}
