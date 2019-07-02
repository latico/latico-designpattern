package com.latico.designpattern.behavioral.state.context.impl;

import com.latico.designpattern.behavioral.state.context.WeatherContext;
import com.latico.designpattern.behavioral.state.state.WeatherState;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 19:19
 * @Version: 1.0
 */
public class WeatherContextImpl implements WeatherContext {
    /**
     * 状态，执行具体的业务
     */
    private WeatherState state;

    /**
     * 天空中云朵容量数量，判断数值来决定自动切换状态
     */
    private int skyCloudCapacity = 3;

    @Override
    public void setWeatherState(WeatherState state) {
        this.state = state;
    }

    /**
     * 当演变到一定程度，超过容量后，就进行下一个状态的获取执行
     */
    @Override
    public void evolve() {
        state.setSize(state.getSize() + 1);

        //原状态未消耗完继续执行，消耗完就获取它的下一个状态
        if (state.getSize() <= skyCloudCapacity) {
            state.execute();

        }else{
            //进行状态变更
            this.state = state.getNextState(1);
            this.state.execute();
        }

    }
}
