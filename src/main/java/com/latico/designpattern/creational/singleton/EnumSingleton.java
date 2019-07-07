package com.latico.designpattern.creational.singleton;

/**
 * <PRE>
 * 枚举[不推荐用]
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。可能是因为枚举在JDK1.5中才添加，所以在实际项目开发中，很少见人这么写过。
 *
 * 枚举通常需要的内存是静态常量的两倍多。你应该严格避免在Android上使用枚举。
 * 而且枚举不能进行继承，不方便扩展。
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 1:19
 * @Version: 1.0
 */
public enum EnumSingleton {

    /**
     * 实例
     */
    instance;

    /**
     * 调用该方法可以获取实例，建议外界可以直接通过EnumSingleton.instance获取实例
     * @return
     */
    public static EnumSingleton getInstance() {
        return instance;
    }

    private String name;
    private int age;

    EnumSingleton() {
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
        final StringBuilder sb = new StringBuilder("EnumSingleton{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
