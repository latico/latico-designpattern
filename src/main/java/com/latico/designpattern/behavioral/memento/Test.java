package com.latico.designpattern.behavioral.memento;

import com.latico.designpattern.behavioral.memento.caretaker.GameCaretaker;
import com.latico.designpattern.behavioral.memento.originator.GameOriginator;
import com.latico.designpattern.behavioral.memento.originator.impl.GameOriginatorImpl;

/**
 * <PRE>
 * 备忘录模式用于保存和恢复对象的状态，相信大家看过我前面的拙作就会想到原型模式也能保存一个
 * 对象在某一个时刻的状态，那么两者有何不同的呢？原型模式保存的是当前对象的所有状态信息，
 * 恢复的时候会生成与保存的对象完全相同的另外一个实例；而备忘录模式保存的是我们关心的在恢复时
 * 需要的对象的部分状态信息，相当于快照。备忘录模式大家肯定都见过，比如在玩游戏的时候有一个
 * 保存当前闯关的状态的功能，会对当前用户所处的状态进行保存，当用户闯关失败或者需要从快照的
 * 地方开始的时候，就能读取当时保存的状态完整地恢复到当时的环境，
 * 这一点和VMware上面的快照功能很类似。
 *
 * 示例：
 * 创建游戏存档，从游戏存档加载数据
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 15:02
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //创建一个玩家的存档存储器
        GameCaretaker caretaker = new GameCaretaker();

        //创建一个原发器，玩家
        GameOriginator originator = new GameOriginatorImpl();

        //打怪升级
        originator.setState("正在打小怪，玩到了10级");

        //创建一个存档名字为10
        //用存储器把存档保存起来
        caretaker.addGameMemento("10", originator.createGameMemento());

        //继续打怪
        originator.setState("正在打中等boss，玩到了20级");

        //创建一个存档名字为20
        //用存储器把存档保存起来
        caretaker.addGameMemento("20", originator.createGameMemento());

        //继续打怪
        originator.setState("正在打大boss，玩到了30级");

        //创建一个存档名字为30
        //用存储器把存档保存起来
        caretaker.addGameMemento("30", originator.createGameMemento());

        //查看当前进度
        originator.showState();

        //怀念20级的日子，想回到过去玩玩
        originator.loadStateByGameMemento(caretaker.getGameMemento("20"));
        //查看20级的时候的存档状态
        originator.showState();

        //又回到30级的时候状态
        originator.loadStateByGameMemento(caretaker.getGameMemento("30"));
        //查看20级的时候的存档状态
        originator.showState();
    }
}
