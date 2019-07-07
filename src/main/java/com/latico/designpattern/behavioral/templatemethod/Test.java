package com.latico.designpattern.behavioral.templatemethod;

import com.latico.designpattern.behavioral.templatemethod.refreshbeverage.impl.CoffeeRefreshBeverageImpl;
import com.latico.designpattern.behavioral.templatemethod.refreshbeverage.impl.TeaRefreshBeverageImpl;
import com.latico.designpattern.behavioral.templatemethod.refreshbeverage.RefreshBeverage;

/**
 * <PRE>
 * 场景：接口类是泡制提神饮料，可以选择茶或者咖啡，利用抽象类里面定义了模板流程（部分接口需要子类实现）：
 * 1、将水煮沸，基本方法，不需要子类实现；
 * 2、泡制饮料，具体使用什么材料，让子类决定；
 * 3、把饮料放进杯中，基本方法，不需要子类实现；
 * 4、加什么调味料，需要子类实现；
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 22:03
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //制造一杯茶
        RefreshBeverage teaRefreshBeverage = new TeaRefreshBeverageImpl();
        teaRefreshBeverage.makeBeverageTemplate();

        System.out.println("===============");

        //制造一杯咖啡
        RefreshBeverage coffeeRefreshBeverage = new CoffeeRefreshBeverageImpl();
        coffeeRefreshBeverage.makeBeverageTemplate();

    }
}
