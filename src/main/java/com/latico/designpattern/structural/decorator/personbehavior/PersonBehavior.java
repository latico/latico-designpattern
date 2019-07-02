package com.latico.designpattern.structural.decorator.personbehavior;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 22:31
 * @Version: 1.0
 */
public interface PersonBehavior {

    /**
     * @return 类型，男生/女生
     */
    String getType();
    /**
     * 去约会
     */
    void toDate();
}
