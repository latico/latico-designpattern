package com.latico.designpattern.behavioral.memento.originator;

import com.latico.designpattern.behavioral.memento.memento.GameMemento;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 15:13
 * @Version: 1.0
 */
public interface GameOriginator {
    /**
     * 设置状态，游戏进度
     * @param state
     */
    void setState(String state);

    /**
     * 获取状态，游戏进度
     */
    String getState();

    /**
     * 显示当前游戏进度信息
     * @return
     */
    void showState();

    /**
     * 根据当前游戏进度，创建一个存档
     * @return
     */
    GameMemento createGameMemento();

    /**
     * 把当前游戏，录入某个存档
     * @param memento
     * @return
     */
    void loadStateByGameMemento(GameMemento memento);
}
