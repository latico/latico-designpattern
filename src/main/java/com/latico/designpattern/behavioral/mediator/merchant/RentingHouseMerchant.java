package com.latico.designpattern.behavioral.mediator.merchant;

import com.latico.designpattern.behavioral.mediator.bean.House;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 0:31
 * @Version: 1.0
 */
public interface RentingHouseMerchant {

    /**
     * 添加房子信息
     * @param house
     */
    void setHouse(House house);

    /**
     * 提供房子信息
     * @return
     */
    House offerHouseInfo();

    /**
     * 成交
     * @param house
     */
    void makeBargain(House house);

    /**
     * @return 商家名字
     */
    String getName();
}
