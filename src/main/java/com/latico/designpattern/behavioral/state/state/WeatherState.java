package com.latico.designpattern.behavioral.state.state;

/**
 * <PRE>
 * 天气状态
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 19:11
 * @Version: 1.0
 */
public interface WeatherState {

    /**
     * 执行天气动作
     */
    void execute();

    /**
     * @return 获取大小
     */
    int getSize();

    /**
     * 设置大小
     * @return
     */
    void setSize(int size);

    /**
     * 获取下一个状态
     * @param initSize
     * @return
     */
    WeatherState getNextState(int initSize);
}
