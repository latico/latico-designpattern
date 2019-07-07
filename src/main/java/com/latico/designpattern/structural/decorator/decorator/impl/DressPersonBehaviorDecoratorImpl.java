package com.latico.designpattern.structural.decorator.decorator.impl;

import com.latico.designpattern.structural.decorator.decorator.AbstractPersonBehaviorDecorator;
import com.latico.designpattern.structural.decorator.personbehavior.PersonBehavior;

/**
 * <PRE>
 * 穿衣打扮行为修饰
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 22:40
 * @Version: 1.0
 */
public class DressPersonBehaviorDecoratorImpl extends AbstractPersonBehaviorDecorator {
    public DressPersonBehaviorDecoratorImpl() {
    }
    public DressPersonBehaviorDecoratorImpl(PersonBehavior personBehavior) {
        this.personBehavior = personBehavior;
    }
    @Override
    public void toDate() {
        System.out.println(getType() + "穿衣打扮");
        super.toDate();
    }
}
