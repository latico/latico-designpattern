package com.latico.designpattern.creational.factory.staticfactory;

import com.latico.designpattern.creational.factory.staticfactory.noodles.Noodles;

/**
 * <PRE>
 * 最简单的工厂模式，工厂类不是接口或者抽象类，工厂类纯粹提供静态方法获取对象
 *
 简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，
 但不属于23种GOF设计模式之一。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现。

 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:53
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        Noodles noodles = NoodlesFactory.createNoodles(NoodlesFactory.NoodlesTypeEnum.PAOMIAN);
        System.out.println(noodles.desc());

        noodles = NoodlesFactory.createNoodles(NoodlesFactory.NoodlesTypeEnum.LANZHOU);
        System.out.println(noodles.desc());
    }
}
