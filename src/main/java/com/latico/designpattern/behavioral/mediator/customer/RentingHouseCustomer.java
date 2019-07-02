package com.latico.designpattern.behavioral.mediator.customer;

import com.latico.designpattern.behavioral.mediator.bean.House;
import com.latico.designpattern.behavioral.mediator.mediator.RentingHouseMediator;

import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-18 23:45
 * @Version: 1.0
 */
public interface RentingHouseCustomer {

    /**
     * 设置中介进来 或者 更换其他中介
     * @param mediator
     */
    void setRentingHouseMediator(RentingHouseMediator mediator);

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
}
