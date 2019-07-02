package com.latico.designpattern.creational.singleton;

/**
 * <PRE>
 * 双重检查[推荐用]
 * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 *
 * 优点：线程安全、延迟加载、效率较高，比起枚举类型可以通过继承其他类进行扩展。
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-13 23:56
 * @Version: 1.0
 */
public class DoubleCheck {

    /**
     * 私有单例对象，需要使用volatile，让其他线程直接可见
     */
    private static volatile DoubleCheck instance;

    /**
     * 提供给外界获取单例的方法
     * @return 单例对象
     */
    public static DoubleCheck getInstance() {
        //第一层检测，在锁的外面判断是否为空，效率高
        if (instance == null) {
            //开始进入加锁创建对象
            synchronized (DoubleCheck.class) {
                //第二层检测，因为第一层检测期间可能其他线程正则创建，但是未创建完成，所以需要在这里进行二次判断
                if (instance == null) {
                    //创建实例
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

    /**
     * 私有构造方法，让外界不能创建对象，在这里做初始化逻辑处理
     */
    private DoubleCheck() {
        initOrRefreshConfig();
    }

    private String name;
    private int age;

    /**
     * 加载配置或者刷新配置
     */
    public void initOrRefreshConfig() {
        this.name = "xiaoming";
        this.age = 3;
        System.out.println("初始化配置完成");
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
