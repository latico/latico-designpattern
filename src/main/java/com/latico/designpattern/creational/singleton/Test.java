package com.latico.designpattern.creational.singleton;

/**
 * <PRE>
 * 对象实例唯一
 * 示例：检测hashCode是否一样，
 * 一般情况下，单例对象中的字段基本都是非线程安全的，所以使用单例的时候，不要提供setter方法，
 * 如果某个字段提供了setter方法，那么该字段应该设置成线程安全。
 *
 *
 优点
 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。

 缺点
 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new，可能会给其他开发人员造成困扰，特别是看不到源码的时候。

 适用场合
 需要频繁的进行创建和销毁的对象；
 创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
 工具类对象；
 频繁访问数据库或文件的对象。

 懒汉式：延迟加载
 饿汉式：直接加载
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 1:56
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(DoubleCheck.getInstance().hashCode());
        System.out.println(DoubleCheck.getInstance().hashCode());

        System.out.println("==============");
        System.out.println(EnumSingleton.getInstance().hashCode());
        System.out.println(EnumSingleton.getInstance().hashCode());
        System.out.println("==============");

        System.out.println(StaticConstant.getInstance().hashCode());
        System.out.println(StaticConstant.getInstance().hashCode());
        System.out.println("==============");
        System.out.println(StaticInnerClass.getInstance());
        System.out.println(StaticInnerClass.getInstance());

    }
}
