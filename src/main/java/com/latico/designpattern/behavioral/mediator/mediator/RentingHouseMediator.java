package com.latico.designpattern.behavioral.mediator.mediator;

import com.latico.designpattern.behavioral.mediator.bean.House;
import com.latico.designpattern.behavioral.mediator.merchant.RentingHouseMerchant;

import java.util.List;

/**
 * <PRE>
 * 租房中介
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 0:30
 * @Version: 1.0
 */
public interface RentingHouseMediator {

    /**
     * 添加商家信息
     * @param merchant
     */
    void addRentingHouseMerchant(RentingHouseMerchant merchant);

    /**
     * 查询租房信息，客户租房，同时给出能承受的租金
     * @param maxPrice 能承受的最大租金
     * @return 满足条件的房子列表
     */
    List<House> queryRentingHouse(int maxPrice);

    /**
     * 成交
     * @param house 房子
     */
    void makeBargain(House house);

    /**
     * @return 中介的名称
     */
    String getName();
}
