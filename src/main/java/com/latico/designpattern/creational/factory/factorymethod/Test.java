package com.latico.designpattern.creational.factory.factorymethod;

import com.latico.designpattern.creational.factory.factorymethod.messagefactory.MessageFactory;
import com.latico.designpattern.creational.factory.factorymethod.messagefactory.impl.MessageFactoryImpl;
import com.latico.designpattern.creational.factory.factorymethod.message.Message;

/**
 * <PRE>
 * 工厂方法，工厂类是单个产品系列接口类，具体实现需要子类完成，
 * 比静态工厂复杂一层，比抽象工厂简单一层，
 * 工厂方法相当于是抽象工厂里面的其中一个产品系列工厂类，抽象工厂里面有很多产品系列；
 *
 1.模式描述
 提供一个用于创建对象的接口(工厂接口)，让其实现类(工厂实现类)决定实例化哪一个类(产品类)，并且由该实现类创建对应类的实例。

 2.模式作用
 可以一定程度上解耦，消费者和产品实现类隔离开，只依赖产品接口(抽象产品)，产品实现类如何改动与消费者完全无关。

 可以一定程度增加扩展性，若增加一个产品实现，只需要实现产品接口，修改工厂创建产品的方法，消费者可以无感知（若消费者不关心具体产品是什么的情况）。
 可以一定程度增加代码的封装性、可读性。清楚的代码结构，对于消费者来说很少的代码量就可以完成很多工作。
 等等。
 另外，抽象工厂才是实际意义的工厂模式，工厂方法只是抽象工厂的一个比较常见的情况。

 3.适用场景
 消费者不关心它所要创建对象的类(产品类)的时候。

 消费者知道它所要创建对象的类(产品类)，但不关心如何创建的时候。

 等等。

 例如：hibernate里通过sessionFactory创建session、通过代理方式生成ws客户端时，通过工厂构建报文中格式化数据的对象。

 4.模式要素
 提供一个产品类的接口。产品类均要实现这个接口(也可以是abstract类，即抽象产品)。
 提供一个工厂类的接口。工厂类均要实现这个接口(即抽象工厂)。
 由工厂实现类创建产品类的实例。工厂实现类应有一个方法，用来实例化产品类。
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:53
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        MessageFactory messageFactory = new MessageFactoryImpl();
        Message message = messageFactory.createMessage(MessageFactory.MessageTypeEnum.EMAIL);
        message.sendMesage("123");

        message = messageFactory.createMessage(MessageFactory.MessageTypeEnum.SMS);
        message.sendMesage("123");

        message = messageFactory.createMessage(MessageFactory.MessageTypeEnum.OA);
        message.sendMesage("123");
    }
}
