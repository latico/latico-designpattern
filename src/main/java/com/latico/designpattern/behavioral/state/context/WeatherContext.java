package com.latico.designpattern.behavioral.state.context;

import com.latico.designpattern.behavioral.state.state.WeatherState;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 19:17
 * @Version: 1.0
 */
public interface WeatherContext {
    /**
     * 初始化天气状态
     * @param state 天气状态
     */
    void setWeatherState(WeatherState state);

    /**
     * 执行方法，进行一个天气演变
     */
    void evolve();
}
