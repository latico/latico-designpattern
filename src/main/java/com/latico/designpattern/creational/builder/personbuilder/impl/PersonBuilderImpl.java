package com.latico.designpattern.creational.builder.personbuilder.impl;

import com.latico.designpattern.creational.builder.bean.PersonProduct;
import com.latico.designpattern.creational.builder.personbuilder.PersonBuilder;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-02-05 16:42
 * @Version: 1.0
 */
public class PersonBuilderImpl implements PersonBuilder {

    private String type;

    private String head = "默认头部";

    private String body = "默认身体";

    private String foot = "默认脚部";

    @Override
    public PersonBuilder buildType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public PersonBuilder buildHead(String head) {
        this.head = head;
        return this;
    }

    @Override
    public PersonBuilder buildBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public PersonBuilder buildFoot(String foot) {
        this.foot = foot;
        return this;
    }

    @Override
    public PersonProduct build() {
        //调用复杂的构造方法
        return new PersonProduct(type, head, body, foot);
    }
}
