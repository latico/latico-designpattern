package com.latico.designpattern.structural.flyweight.ball.impl;

import com.latico.designpattern.structural.flyweight.ball.Ball;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 18:34
 * @Version: 1.0
 */
public class BasketBallImpl implements Ball {
    @Override
    public void play(String people) {
        System.out.println("球:" + hashCode() + ":" + people + " 打篮球");
    }
}
