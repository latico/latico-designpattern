package com.latico.designpattern.behavioral.mediator.customer.impl;

import com.latico.designpattern.behavioral.mediator.bean.House;
import com.latico.designpattern.behavioral.mediator.customer.RentingHouseCustomer;
import com.latico.designpattern.behavioral.mediator.mediator.RentingHouseMediator;

import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 0:38
 * @Version: 1.0
 */
public class RentingHouseCustomerImpl implements RentingHouseCustomer {
    /**
     * 客户的名字
     */
    private final String name;
    /**
     * 中介的名字
     */
    private RentingHouseMediator mediator;

    public RentingHouseCustomerImpl(String name, RentingHouseMediator mediator) {

        this.name = name;
        this.mediator = mediator;
    }
    @Override
    public void setRentingHouseMediator(RentingHouseMediator mediator) {
        System.out.println(name + ":更换成中介:" + mediator.getName());
        this.mediator = mediator;
    }

    @Override
    public List<House> queryRentingHouse(int maxPrice) {
        System.out.println(name + ":找中介查找房源信息");
        List<House> houses = mediator.queryRentingHouse(maxPrice);
        System.out.println(name + ":查找价格:" + maxPrice + ":满足要求的房子:" + houses);
        return houses;
    }

    @Override
    public void makeBargain(House house) {
        System.out.println(name + ":让中介帮忙找商家确认成交房子:" + house);
        mediator.makeBargain(house);
        System.out.println(name + ":租房成功:" + house);
    }
}
