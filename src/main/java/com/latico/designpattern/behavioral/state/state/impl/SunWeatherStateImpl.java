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
public class SunWeatherStateImpl implements WeatherState {

    private int size;

    public SunWeatherStateImpl(int size) {

        this.size = size;
    }
    @Override
    public void execute() {
        System.out.println("晴天，太阳正旺，气温不断上升，更多的水汽上升到天空会导致阴天，当前状态值:" + size);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        System.out.println("阳光状态变化成:" + size);
        this.size = size;
    }

    @Override
    public WeatherState getNextState(int initSize) {
        System.out.println("太阳太猛，水汽多了，转多云阴天");
        return new CloudyWeatherStateImpl(initSize);
    }
}
