package com.latico.designpattern.behavioral.memento.memento;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 15:04
 * @Version: 1.0
 */
public interface GameMemento {

    /**
     * 设置状态，游戏进度
     * @param state
     */
    void setState(String state);

    /**
     * 获取状态，游戏进度
     */
    String getState();
}
