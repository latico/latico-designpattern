package com.latico.designpattern.creational.prototype;

import com.latico.designpattern.creational.prototype.personprototype.impl.ManPersonPrototypeImpl;
import com.latico.designpattern.creational.prototype.personprototype.impl.WomanPersonPrototypeImpl;
import com.latico.designpattern.creational.prototype.personprototype.PersonPrototype;

/**
 * <PRE>
 *  就是利用JDK的clone()方法进行克隆对象，复用对象里面的数据，不用每次都set
 *
 原型模式
 对象克隆，特别对于有大量字段的对象，如果用的下一个对象跟它有部分字段类似，那就可以使用克隆，每个字段逐个set，很累
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-19 01:38:03
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        //创建一次PersonPrototype，后面复用，因为每次set很烦，所以直接依靠克隆，复用set方法
        PersonPrototype manPersonPrototype = new ManPersonPrototypeImpl();
        manPersonPrototype.setSex("男人");
        manPersonPrototype.setCountry("中国");
        manPersonPrototype.setCity("北京");

        //创建小明，复用国家和城市
        PersonPrototype xiaoming = manPersonPrototype.clone();
        xiaoming.setId("1");
        xiaoming.setName("小明");
        System.out.println(xiaoming.hashCode() + ":" + xiaoming);

        PersonPrototype xiaoqianng = manPersonPrototype.clone();
        xiaoqianng.setId("2");
        xiaoqianng.setName("小强");
        System.out.println(xiaoqianng.hashCode() + ":" + xiaoqianng);


        //创建女人原型
        PersonPrototype womanPersonPrototype = new WomanPersonPrototypeImpl();
        womanPersonPrototype.setSex("女人");
        womanPersonPrototype.setCountry("中国");
        womanPersonPrototype.setCity("广州");
        //创建小红复用
        PersonPrototype xiaohong = womanPersonPrototype.clone();
        xiaohong.setId("3");
        xiaohong.setName("小红");
        System.out.println(xiaohong.hashCode() + ":" + xiaohong);

        //创建小红复用
        PersonPrototype xiaoli = womanPersonPrototype.clone();
        xiaoli.setId("4");
        xiaoli.setName("小丽");
        System.out.println(xiaoli.hashCode() + ":" + xiaoli);
    }
}
