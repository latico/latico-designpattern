package com.latico.designpattern.behavioral.observer.observer.impl;

import com.latico.designpattern.behavioral.observer.observer.WechatOfficialAccoutReader;

import java.util.ArrayList;
import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 14:14
 * @Version: 1.0
 */
public class UserWechatOfficialAccoutReaderImpl implements WechatOfficialAccoutReader {

    private final String userName;

    private final List<String> msgs;

    public UserWechatOfficialAccoutReaderImpl(String userName) {
        this.userName = userName;
        msgs = new ArrayList<>();
    }

    @Override
    public String getName() {
        return userName;
    }

    @Override
    public void receiveMsg(String officialAccoutName, String msg) {
        System.out.println(userName + ":收到公众号"+officialAccoutName+"的消息:" + msg);

        //把消息添加进信箱
        msgs.add("公众号"+officialAccoutName+"的消息:" + msg);
    }

    /**
     * 读取队列第一条消息
     * @return
     */
    @Override
    public String readFirstMsgFromBox(){
        if (msgs.size() >= 1) {
            String msg = msgs.remove(0);
            System.out.println(userName + ":主动读取信息:" + msg);
        }else{
            System.out.println(userName + ":的信箱没有更多新消息");
        }
        return null;
    }

}
