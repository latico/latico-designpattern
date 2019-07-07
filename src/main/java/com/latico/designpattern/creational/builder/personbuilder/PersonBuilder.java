package com.latico.designpattern.creational.builder.personbuilder;

import com.latico.designpattern.creational.builder.bean.PersonProduct;

/**
 * <PRE>
 *  建造者接口
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 17:23:57
 * @Version: 1.0
 */
public interface PersonBuilder {

    /**
     * @param type 类型
     * @return
     */
    PersonBuilder buildType(String type);

    /**
     * 建造单个零件，头部
     */
    PersonBuilder buildHead(String head);

    /**
     * 建造单个零件，身体
     */
    PersonBuilder buildBody(String body);

    /**
     * 建造单个零件，脚
     */
    PersonBuilder buildFoot(String foot);

    /**
     * 零件组装和返回最终产品
     * @return
     */
    PersonProduct build();
}
