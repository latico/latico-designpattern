package com.latico.designpattern.creational.builder;

import com.latico.designpattern.creational.builder.bean.PersonProduct;
import com.latico.designpattern.creational.builder.personbuilder.impl.PersonBuilderImpl;

/**
 * <PRE>
 *     建造者模式
 *     一般用于优化处理构造函数入参过多
 组成部分(四个角色)
 Product —— 产品类
 Builder —— 抽象的Builder类，规范产品的组建，一般由子类实现具体过程
 ConcreteBuilder —— Builder的实现类，实现Builder类中定义方法，并返回组建好的对象
 Director——统一组装过程(现实开发中，一般被省略，直接使用一个Builder来进行对象的组装）

 * 测试场景：制造人偶，
 * 1、由于产品对象PersonProduct构造函数的参数过多，而外界不想使用该方法来构造对象，或者只想传入
 * 其中一部分参数进行构造，
 * 避免出现：new PersonProduct(type, null, null, null); 的情况；
 * 2、外界不需要关注对象创建的流程，只需要传入想要控制的参数，然后调用build()方法。
 *


 * 真实应用场景：
 * 1、Google Protobuf协议  就是使用了建造者模式，没有Director这一层
 * 2、httplient4的对象的配置信息封装到了一个建造者模式 {@link org.apache.http.client.config.RequestConfig.Builder}
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 16:53
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector director = new PersonDirector();
        PersonProduct person = director.constructBeautifulPerson(new PersonBuilderImpl());
        System.out.println(person);

        person = director.constructUglyPerson(new PersonBuilderImpl());
        System.out.println(person);

        person = director.constructDefaultPerson(new PersonBuilderImpl());
        System.out.println(person);

    }
}
