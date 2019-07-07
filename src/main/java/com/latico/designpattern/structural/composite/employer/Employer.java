package com.latico.designpattern.structural.composite.employer;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 0:13
 * @Version: 1.0
 */
public interface Employer {

    /**
     * 添加一个下属给自己
     * @param employer 员工
     */
    void addSubordinate(Employer employer);
}
