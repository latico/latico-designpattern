package com.latico.designpattern.structural.flyweight.ball.impl;

import com.latico.designpattern.structural.flyweight.ball.Ball;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 18:34
 * @Version: 1.0
 */
public class PingPongBallImpl implements Ball {

    @Override
    public void play(String people) {
        System.out.println("球:" + hashCode() + ":" + people + " 打乒乓球");
    }
}
