package com.latico.designpattern.structural.flyweight;

import com.latico.designpattern.structural.flyweight.ball.Ball;

/**
 * <PRE>
 * 共享元素，跟工厂模式的区别在于，工厂模式是创建型设计模式，每次都会new新对象给调用者，
 * 而享元模式就是共享元素，相当于把相关单例统一管理
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 18:36
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        Ball basketBall1 = BallFlyweight.getBall(BallFlyweight.BallTypeEnum.BasketBall);
        Ball basketBall2 = BallFlyweight.getBall(BallFlyweight.BallTypeEnum.BasketBall);

        basketBall1.play("小明");
        basketBall2.play("小强");

        Ball footBall1 = BallFlyweight.getBall(BallFlyweight.BallTypeEnum.FootBall);
        Ball footBall2 = BallFlyweight.getBall(BallFlyweight.BallTypeEnum.FootBall);

        footBall1.play("小红");
        footBall2.play("小丽");

    }
}
