package com.latico.designpattern.creational.singleton;

/**
 * <PRE>
 * 饿汉式（静态常量）
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * <p>
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-13 23:33:48
 * @Version: 1.0
 */
public class StaticConstant {

    /**
     * 创建类的唯一实例，使用private static修饰
     */
    private static final StaticConstant instance = new StaticConstant();

    /**
     * 提供给外界获取单例的方法
     * @return 单例对象
     */
    public static StaticConstant getInstance() {
        return instance;
    }

    /**
     * 将构造方法私有化，不允许外部直接创建对象,在这里初始化配置
     */
    private StaticConstant() {
    }
}
