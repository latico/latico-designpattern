package com.latico.designpattern.structural.facade;

import com.latico.designpattern.structural.facade.facade.impl.BuyTeaFacadeImpl;
import com.latico.designpattern.structural.facade.facade.TeaTraderFacade;

/**
 * <PRE>
 * 外观模式，把所有业务接口统一起来，作为统一的门面外观，让使用者不用关心去哪里找实现类，
 * 直接找到这个门面外观就可以使用支持的所有功能。
 * 示例中包括：买红茶、卖红茶、买绿茶、卖绿茶、买菊花茶、卖菊花茶、还有套餐模式，
 * 门面类中有所有的子系统处理对象
 *
 与适配器模式、桥接模式不同的是，外观模式就是主要目的是提供给外界服务的统一入口，
 也就是外观门面，让外界不需要累死累活找具体的实现类，同时因为包装了这一层，所以降低了耦合度。

 外观模式是一种使用频率非常高的结构型设计模式，它通过引入一个外观角色来简化客户端与子系统之间的交互，
 为复杂的子系统调用提供一个统一的入口，降低子系统与客户端的耦合度，且客户端调用非常方便。

 1. 外观模式概述
 不知道大家有没有比较过自己泡茶和去茶馆喝茶的区别，如果是自己泡茶需要自行准备茶叶、茶具和开水，
 而去茶馆喝茶，最简单的方式就是跟茶馆服务员说想要一杯什么样的茶，
 是铁观音、碧螺春还是西湖龙井？正因为茶馆有服务员，顾客无须直接和茶叶、茶具、开水等交互，
 整个泡茶过程由服务员来完成，顾客只需与服务员交互即可，整个过程非常简单省事

 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 23:58
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TeaTraderFacade teaTraderFacade = new BuyTeaFacadeImpl();
        System.out.println("====================");
        teaTraderFacade.buyRedTea();
        System.out.println("====================");
        teaTraderFacade.buyGreenTea();
        System.out.println("====================");
        teaTraderFacade.buyChrysanthemumTea();
        System.out.println("====================");
        teaTraderFacade.buyGreenAndRedTea();
        System.out.println("====================");
        teaTraderFacade.buyGreenAndRedAndChrysanthemumTea();
        System.out.println("====================");

        System.out.println("====================");
        teaTraderFacade.sellRedTea();
        System.out.println("====================");
        teaTraderFacade.sellGreenTea();
        System.out.println("====================");
        teaTraderFacade.sellChrysanthemumTea();
        System.out.println("====================");
        teaTraderFacade.sellGreenAndRedTea();
        System.out.println("====================");
        teaTraderFacade.sellGreenAndRedAndChrysanthemumTea();
        System.out.println("====================");
    }
}
