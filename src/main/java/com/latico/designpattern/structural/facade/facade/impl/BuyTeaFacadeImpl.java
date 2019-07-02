package com.latico.designpattern.structural.facade.facade.impl;

import com.latico.designpattern.structural.facade.buytea.impl.BuyChrysanthemumTeaImpl;
import com.latico.designpattern.structural.facade.buytea.impl.BuyGreenTeaImpl;
import com.latico.designpattern.structural.facade.buytea.impl.BuyRedTeaImpl;
import com.latico.designpattern.structural.facade.facade.TeaTraderFacade;
import com.latico.designpattern.structural.facade.selltea.impl.SellChrysanthemumTeaImpl;
import com.latico.designpattern.structural.facade.selltea.impl.SellGreenTeaImpl;
import com.latico.designpattern.structural.facade.selltea.impl.SellRedTeaImpl;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 23:49
 * @Version: 1.0
 */
public class BuyTeaFacadeImpl implements TeaTraderFacade {
    private BuyChrysanthemumTeaImpl buyChrysanthemumTeaImpl;
    private BuyGreenTeaImpl buyGreenTeaImpl;
    private BuyRedTeaImpl buyRedTeaImpl;

    private SellChrysanthemumTeaImpl sellChrysanthemumTeaImpl;
    private SellGreenTeaImpl sellGreenTeaImpl;
    private SellRedTeaImpl sellRedTeaImpl;

    public BuyTeaFacadeImpl() {
        buyChrysanthemumTeaImpl = new BuyChrysanthemumTeaImpl();
        buyGreenTeaImpl = new BuyGreenTeaImpl();
        buyRedTeaImpl = new BuyRedTeaImpl();

        sellChrysanthemumTeaImpl = new SellChrysanthemumTeaImpl();
        sellGreenTeaImpl = new SellGreenTeaImpl();
        sellRedTeaImpl = new SellRedTeaImpl();
    }


    @Override
    public void buyRedTea() {
        buyRedTeaImpl.buyTea();
    }

    @Override
    public void buyGreenTea() {
        buyGreenTeaImpl.buyTea();
    }

    @Override
    public void buyChrysanthemumTea() {
        buyChrysanthemumTeaImpl.buyTea();
    }

    @Override
    public void buyGreenAndRedTea() {
        System.out.println("套餐一，两杯半价：");
        buyRedTeaImpl.buyTea();
        buyGreenTeaImpl.buyTea();
    }

    @Override
    public void buyGreenAndRedAndChrysanthemumTea() {
        System.out.println("套餐二，三杯半价：");
        buyRedTeaImpl.buyTea();
        buyGreenTeaImpl.buyTea();
        buyChrysanthemumTeaImpl.buyTea();
    }

    @Override
    public void sellRedTea() {
        sellRedTeaImpl.sellTea();
    }

    @Override
    public void sellGreenTea() {
        sellGreenTeaImpl.sellTea();
    }

    @Override
    public void sellChrysanthemumTea() {
        sellChrysanthemumTeaImpl.sellTea();
    }

    @Override
    public void sellGreenAndRedTea() {
        System.out.println("套餐一，两杯半价：");
        sellRedTeaImpl.sellTea();
        sellGreenTeaImpl.sellTea();
    }

    @Override
    public void sellGreenAndRedAndChrysanthemumTea() {
        System.out.println("套餐二，三杯半价：");
        sellRedTeaImpl.sellTea();
        sellGreenTeaImpl.sellTea();
        sellChrysanthemumTeaImpl.sellTea();
    }
}
