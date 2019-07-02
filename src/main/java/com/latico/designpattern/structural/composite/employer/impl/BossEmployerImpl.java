package com.latico.designpattern.structural.composite.employer.impl;

import com.latico.designpattern.structural.composite.employer.AbstractEmployer;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 23:26
 * @Version: 1.0
 */
public class BossEmployerImpl extends AbstractEmployer {

    public BossEmployerImpl() {
        setType("老板");
    }
    public BossEmployerImpl(String name) {
        super(name);
        setType("老板");
    }
}
