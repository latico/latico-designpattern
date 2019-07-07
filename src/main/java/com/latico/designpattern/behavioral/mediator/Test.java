package com.latico.designpattern.behavioral.mediator;

import com.latico.designpattern.behavioral.mediator.bean.House;
import com.latico.designpattern.behavioral.mediator.customer.RentingHouseCustomer;
import com.latico.designpattern.behavioral.mediator.customer.impl.RentingHouseCustomerImpl;
import com.latico.designpattern.behavioral.mediator.mediator.RentingHouseMediator;
import com.latico.designpattern.behavioral.mediator.mediator.impl.RentingHouseMediatorImpl;
import com.latico.designpattern.behavioral.mediator.merchant.RentingHouseMerchant;
import com.latico.designpattern.behavioral.mediator.merchant.impl.RentingHouseMerchantImpl;

import java.util.List;

/**
 * <PRE>
 * 流程：中介对象持有所有商家信息，租房客户对象持有中介信息，租客租房的时候会让中介帮忙，
 * 中介会在中介协调租客和房东进行成交。
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 0:59
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建商家和商家的房源信息
        House xiaomingHouse = new House();
        xiaomingHouse.setPrice(2500);
        xiaomingHouse.setSize(65);
        xiaomingHouse.setStructure("两房一厅");
        RentingHouseMerchant merchantXiaoming = new RentingHouseMerchantImpl("房东小明", xiaomingHouse);

        //创建商家和商家的房源信息
        House xiaoqiangHouse = new House();
        xiaoqiangHouse.setPrice(1500);
        xiaoqiangHouse.setSize(50);
        xiaoqiangHouse.setStructure("一房一厅");
        RentingHouseMerchant merchantXiaoqiang = new RentingHouseMerchantImpl("房东小强", xiaoqiangHouse);

        //创建商家和商家的房源信息
        House xiaohongHouse = new House();
        xiaohongHouse.setPrice(1000);
        xiaohongHouse.setSize(30);
        xiaohongHouse.setStructure("单间");
        RentingHouseMerchant merchantXiaohong = new RentingHouseMerchantImpl("房东小红", xiaohongHouse);
        
        //创建租房中介
        RentingHouseMediator mediatorXiaolan = new RentingHouseMediatorImpl("租房中介平台小蓝");
        //把商家添加到中介中
        mediatorXiaolan.addRentingHouseMerchant(merchantXiaoming);
        mediatorXiaolan.addRentingHouseMerchant(merchantXiaoqiang);
        mediatorXiaolan.addRentingHouseMerchant(merchantXiaohong);

        //创建租客，查询租房信息，成交房子
        RentingHouseCustomer customerXiaoli = new RentingHouseCustomerImpl("租客小丽", mediatorXiaolan);
        //指定最大承受价格，查询满足要求的所有房子 TODO
        int maxPrice = 2000;
        List<House> houses = customerXiaoli.queryRentingHouse(maxPrice);

        //如果有满足要求的，选第一间
        if (houses != null && !houses.isEmpty()) {
            System.out.println("找到房源，就选第一间吧");
            customerXiaoli.makeBargain(houses.get(0));

        }else{
            System.out.println("没有满足要求的房子，准备更换中介");
            RentingHouseMediator mediatorXiaowang = new RentingHouseMediatorImpl("租房中介小王");
            customerXiaoli.setRentingHouseMediator(mediatorXiaowang);
        }

    }
}
