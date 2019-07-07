package com.latico.designpattern.behavioral.state.state.impl;

import com.latico.designpattern.behavioral.state.state.WeatherState;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 19:12
 * @Version: 1.0
 */
public class RainyWeatherStateImpl implements WeatherState {

    /**
     * 状态值
     */
    private int size;

    public RainyWeatherStateImpl(int size) {

        this.size = size;
    }
    @Override
    public void execute() {
        System.out.println("下雨天，云朵不断减少会露出太阳，当前状态值:" + size);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        System.out.println("雨水状态变化成:" + size);
        this.size = size;
    }

    @Override
    public WeatherState getNextState(int initSize) {
        System.out.println("雨水下完了，转晴天");
        return new SunWeatherStateImpl(initSize);
    }
}
