package com.latico.designpattern.behavioral.memento.caretaker;

import com.latico.designpattern.behavioral.memento.memento.GameMemento;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 15:06
 * @Version: 1.0
 */
public class GameCaretaker {
    /**
     * 所有存档，key是存档的名字
     */
    private Map<String, GameMemento> mementos;

    public GameCaretaker() {
        mementos = new HashMap<>();
    }

    /**
     * 添加一个备忘录到存储器中
     * @param name 存档的名字
     * @param memento 备忘录，存档
     */
    public void addGameMemento(String name, GameMemento memento) {
        mementos.put(name, memento);
    }


    /**
     * 获取一个备忘录
     * @param name 存档的名字
     */
    public GameMemento getGameMemento(String name) {
        return mementos.get(name);
    }


    /**
     * 删除一个备忘录
     * @param name 存档的名字
     */
    public GameMemento removeGameMemento(String name) {
        return mementos.remove(name);
    }
}
