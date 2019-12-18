package com.latico.designpattern.creational.singleton;

/**
 * <PRE>
 *    懒汉式
 *    静态内部类[推荐用，但是在某些场景会出现问题，比如opendaylight的容器中不能正确识别到静态内部类导致不可用]
 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，
 而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，
 调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。

 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，
 在类进行初始化时，别的线程是无法进入的。

 优点：避免了线程不安全，延迟加载，效率高。
 缺点：需要创建多一个类，可能存在某些容器不支持静态内部类的风险
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 0:56
 * @Version: 1.0
 */
public class StaticInnerClass {

    private String name;
    private int age;
    /**
     * 实例持有者
     */
    private static class InstanceHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    /**
     * 提供给外界获取单例的方法
     * @return 单例对象
     */
    public static StaticInnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private StaticInnerClass() {
        System.out.println("开始构造对象");
        initOrRefreshConfig();
        System.out.println("构造对象完成:" + toString());
    }

    /**
     * 加载配置或者刷新配置
     */
    public void initOrRefreshConfig() {
        this.name = "xiaoming";
        this.age = 3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DoubleCheck{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}
