package com.latico.designpattern.structural.decorator.decorator;

import com.latico.designpattern.structural.decorator.personbehavior.PersonBehavior;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 22:37
 * @Version: 1.0
 */
public abstract class AbstractPersonBehaviorDecorator implements PersonBehavior {

    protected PersonBehavior personBehavior;

    public AbstractPersonBehaviorDecorator() {
    }

    /**
     * 可以通过构造函数传入被修饰对象
     * @param personBehavior
     */
    public AbstractPersonBehaviorDecorator(PersonBehavior personBehavior) {
        this.personBehavior = personBehavior;
    }
    /**
     * 可以通过set函数传入被修饰对象
     * @param personBehavior
     */
    public void setPersonBehavior(PersonBehavior personBehavior) {
        this.personBehavior = personBehavior;
    }

    /**
     * 该抽象类使用被修饰对象的方法实现
     * @return
     */
    @Override
    public String getType() {
        return personBehavior.getType();
    }

    /**
     * 该抽象类使用被修饰对象的方法实现
     */
    @Override
    public void toDate() {
        personBehavior.toDate();
    }
}
