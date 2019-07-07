package com.latico.designpattern.behavioral.templatemethod.refreshbeverage;

/**
 * <PRE>
 * 模板类，需要使用抽象类
 *
 * 提神饮料
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 21:54
 * @Version: 1.0
 */
public abstract class AbstractRefreshBeverage implements RefreshBeverage {

    /**
     * 制造饮料的模板方法，控制流程模板
     */
    @Override
    public void makeBeverageTemplate(){
        boilWater();
        brewBeverage();
        pourInCup();

        if (isAddseasoner()) {
            addSeasoner();
        }

    }

    /**
     * 基本方法，不需要子类实现
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 泡制饮料，具体使用什么材料，让子类决定
     */
    protected abstract void brewBeverage();

    /**
     * 把饮料放进杯中，基本方法，不需要子类实现
     */
    private void pourInCup() {
        System.out.println("把饮料放进杯中");
    }

    /**
     * 是否加调味料，让子类实现
     * @return
     */
    protected abstract boolean isAddseasoner();

    /**
     * 加什么调味料，需要子类实现
     */
    protected abstract void addSeasoner();
}
