package com.latico.designpattern.structural.decorator;

import com.latico.designpattern.structural.decorator.decorator.impl.DoHairPersonBehaviorDecoratorImpl;
import com.latico.designpattern.structural.decorator.decorator.impl.DressPersonBehaviorDecoratorImpl;
import com.latico.designpattern.structural.decorator.decorator.impl.HaveShowerPersonBehaviorDecoratorImpl;
import com.latico.designpattern.structural.decorator.personbehavior.PersonBehavior;
import com.latico.designpattern.structural.decorator.personbehavior.impl.ManPersonBehaviorImpl;
import com.latico.designpattern.structural.decorator.personbehavior.impl.WomanPersonBehaviorImpl;

/**
 * <PRE>
 * 装饰模式
 * 在不会改变原有对象执行业务方法的情况下，对即将要做的事情修饰增强
 * 示例中是约会
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 22:46
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //男生行为
        PersonBehavior manPersonBehavior = new ManPersonBehaviorImpl();
        //用洗个澡装饰男生
        PersonBehavior haveShowerPersonBehaviorDecorator = new HaveShowerPersonBehaviorDecoratorImpl(manPersonBehavior);
        //用打扮装饰男生
        PersonBehavior manDressPersonBehaviorDecorator = new DressPersonBehaviorDecoratorImpl(haveShowerPersonBehaviorDecorator);
        //出发
        manDressPersonBehaviorDecorator.toDate();

        System.out.println("=============================");

        //女生行为
        PersonBehavior womanPersonBehaviorImpl = new WomanPersonBehaviorImpl();
        //用做头发装饰女生
        PersonBehavior doHairPersonBehaviorDecorator = new DoHairPersonBehaviorDecoratorImpl(womanPersonBehaviorImpl);
        //用打扮装饰女生
        PersonBehavior womanDressPersonBehaviorDecorator = new DressPersonBehaviorDecoratorImpl(doHairPersonBehaviorDecorator);
        //出发
        womanDressPersonBehaviorDecorator.toDate();

    }
}
