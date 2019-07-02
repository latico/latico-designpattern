package com.latico.designpattern.behavioral.state.state.impl;

import com.latico.designpattern.behavioral.state.state.WeatherState;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 19:12
 * @Version: 1.0
 */
public class CloudyWeatherStateImpl implements WeatherState {
    private int size;

    public CloudyWeatherStateImpl(int size) {

        this.size = size;
    }
    @Override
    public void execute() {
        System.out.println("多云，阴天，云朵不断聚合会导致下雨，当前状态值:" + size);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        System.out.println("云朵状态变化成:" + size);
        this.size = size;
    }

    @Override
    public WeatherState getNextState(int initSize) {
        System.out.println("水汽聚集在一起，阴天转下雨天");
        return new RainyWeatherStateImpl(initSize);
    }
}
