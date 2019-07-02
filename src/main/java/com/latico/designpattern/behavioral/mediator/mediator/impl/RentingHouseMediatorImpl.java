package com.latico.designpattern.behavioral.mediator.mediator.impl;

import com.latico.designpattern.behavioral.mediator.bean.House;
import com.latico.designpattern.behavioral.mediator.mediator.RentingHouseMediator;
import com.latico.designpattern.behavioral.mediator.merchant.RentingHouseMerchant;

import java.util.ArrayList;
import java.util.List;

/**
 * <PRE>
 * 中介
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 0:44
 * @Version: 1.0
 */
public class RentingHouseMediatorImpl implements RentingHouseMediator {

    /**
     * 中介拥有商家信息
     */
    private List<RentingHouseMerchant> merchants;
    /**
     * 中介的名字
     */
    private String name;

    public RentingHouseMediatorImpl(String name) {
        this.name = name;
        this.merchants = new ArrayList<>();
    }

    @Override
    public void addRentingHouseMerchant(RentingHouseMerchant merchant) {
        System.out.println(name + ":增加新的商家信息:" + merchant.getName());
        merchants.add(merchant);
    }

    @Override
    public List<House> queryRentingHouse(int maxPrice) {
        System.out.println(name + ":中介遍历所有商家查找符合要求的房子");
        List<House> houses = new ArrayList<>();
        for (RentingHouseMerchant merchant : merchants) {
            House house = merchant.offerHouseInfo();
            if (house.getPrice() <= maxPrice) {
                houses.add(house);
            }
        }
        return houses;
    }

    @Override
    public void makeBargain(House house) {

        System.out.println(name + ":中介遍历查找租客想要的房源所属的商家");
        for (RentingHouseMerchant merchant : merchants) {
            if (merchant.offerHouseInfo() == house) {
                System.out.println(name + ":中介找到了房子归属的商家:" + merchant.getName());
                merchant.makeBargain(house);
                break;
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
