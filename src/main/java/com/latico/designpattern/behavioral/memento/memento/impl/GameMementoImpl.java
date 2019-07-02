package com.latico.designpattern.behavioral.memento.memento.impl;

import com.latico.designpattern.behavioral.memento.memento.GameMemento;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 15:04
 * @Version: 1.0
 */
public class GameMementoImpl implements GameMemento {

    private String state;

    public GameMementoImpl(String state) {
        this.state = state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return this.state;
    }
}
