package com.latico.designpattern.structural.flyweight;

import com.latico.designpattern.structural.flyweight.ball.Ball;
import com.latico.designpattern.structural.flyweight.ball.impl.BasketBallImpl;
import com.latico.designpattern.structural.flyweight.ball.impl.FootBallImpl;
import com.latico.designpattern.structural.flyweight.ball.impl.PingPongBallImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <PRE>
 * 球享元工厂
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 18:33
 * @Version: 1.0
 */
public class BallFlyweight {
    public enum BallTypeEnum{
        FootBall,
        PingPongBall,
        BasketBall,
        ;
    }

    /**
     * 共享数据
     */
    private static final Map<BallTypeEnum, Ball> flyweights = new ConcurrentHashMap<>();

    static {
        flyweights.put(BallTypeEnum.BasketBall, new BasketBallImpl());
        flyweights.put(BallTypeEnum.FootBall, new FootBallImpl());
        flyweights.put(BallTypeEnum.PingPongBall, new PingPongBallImpl());
    }

    /**
     * 拿一个球
     * @param type 球类型
     * @return
     */
    public static Ball getBall(BallTypeEnum type) {
        return flyweights.get(type);
    }
}
