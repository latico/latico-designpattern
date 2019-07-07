package com.latico.designpattern.structural.facade.facade;

/**
 * <PRE>
 * 茶交易外观门面，把所有相关的功能提供统一的对外业务接口
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 23:55
 * @Version: 1.0
 */
public interface TeaTraderFacade {
    /**
     * 买红茶
     */
    void buyRedTea();

    /**
     * 买绿茶
     */
    void buyGreenTea();

    /**
     * 买菊花茶
     */
    void buyChrysanthemumTea();

    /**
     * 套餐一，红茶和绿茶，两杯半价
     */
    void buyGreenAndRedTea();


    /**
     * 套餐二，绿茶、红茶、菊花茶，三杯半价
     */
    void buyGreenAndRedAndChrysanthemumTea();

    /**
     * 买红茶
     */
    void sellRedTea();

    /**
     * 买绿茶
     */
    void sellGreenTea();

    /**
     * 买菊花茶
     */
    void sellChrysanthemumTea();

    /**
     * 套餐一，红茶和绿茶，两杯半价
     */
    void sellGreenAndRedTea();


    /**
     * 套餐二，绿茶、红茶、菊花茶，三杯半价
     */
    void sellGreenAndRedAndChrysanthemumTea();
}
