package com.latico.designpattern.behavioral.memento.originator.impl;

import com.latico.designpattern.behavioral.memento.memento.GameMemento;
import com.latico.designpattern.behavioral.memento.memento.impl.GameMementoImpl;
import com.latico.designpattern.behavioral.memento.originator.GameOriginator;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 15:16
 * @Version: 1.0
 */
public class GameOriginatorImpl implements GameOriginator {
    /**
     * 游戏进度状态
     */
    private String state;

    @Override
    public void setState(String state) {

        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void showState() {
        System.out.println("当前游戏进度:" + state);
    }

    @Override
    public GameMemento createGameMemento() {
        return new GameMementoImpl(state);
    }

    @Override
    public void loadStateByGameMemento(GameMemento memento) {
        this.state = memento.getState();
    }
}
