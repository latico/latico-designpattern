package com.latico.designpattern.behavioral.mediator.merchant.impl;

import com.latico.designpattern.behavioral.mediator.bean.House;
import com.latico.designpattern.behavioral.mediator.merchant.RentingHouseMerchant;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 0:40
 * @Version: 1.0
 */
public class RentingHouseMerchantImpl implements RentingHouseMerchant {

    /**
     * 商家名字
     */
    private String name;
    /**
     * 拥有的房子信息
     */
    private House house;

    public RentingHouseMerchantImpl(String name, House house) {
        this.name = name;
        this.house = house;
    }
    @Override
    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public House offerHouseInfo() {
        System.out.println(name + ":提供房源信息:" + house);
        return this.house;
    }

    @Override
    public void makeBargain(House house) {
        System.out.println(name + ":成交房源信息:" + house);
    }

    @Override
    public String getName() {
        return name;
    }
}
