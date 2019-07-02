package com.latico.designpattern.structural.decorator.decorator.impl;

import com.latico.designpattern.structural.decorator.decorator.AbstractPersonBehaviorDecorator;
import com.latico.designpattern.structural.decorator.personbehavior.PersonBehavior;

/**
 * <PRE>
 * 洗澡行为修饰
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 22:40
 * @Version: 1.0
 */
public class HaveShowerPersonBehaviorDecoratorImpl extends AbstractPersonBehaviorDecorator {
    public HaveShowerPersonBehaviorDecoratorImpl() {
    }
    public HaveShowerPersonBehaviorDecoratorImpl(PersonBehavior personBehavior) {
        this.personBehavior = personBehavior;
    }
    @Override
    public void toDate() {
        System.out.println(getType() + "洗个澡");
        super.toDate();
    }
}
