package com.latico.designpattern.creational.factory.staticfactory;

import com.latico.designpattern.creational.factory.staticfactory.noodles.Noodles;
import com.latico.designpattern.creational.factory.staticfactory.noodles.impl.LanZhouNoodlesImpl;
import com.latico.designpattern.creational.factory.staticfactory.noodles.impl.PaoNoodlesImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 09:37:48
 * @Version: 1.0
 */
public class NoodlesFactory {

    /**
     * 用枚举的方式定义类型
     */
    public enum NoodlesTypeEnum {

        /**
         * 兰州拉面
         */
        LANZHOU,

        /**
         * 泡面
         */
        PAOMIAN,

        ;
    }

    private static Map<NoodlesTypeEnum, Class<? extends Noodles>> noodlesTypeEnumClassMap;

    static {
        noodlesTypeEnumClassMap = new HashMap<>();
        noodlesTypeEnumClassMap.put(NoodlesTypeEnum.LANZHOU, LanZhouNoodlesImpl.class);
        noodlesTypeEnumClassMap.put(NoodlesTypeEnum.PAOMIAN, PaoNoodlesImpl.class);
    }

    /**
     * 缺点：每个加一种类型就要修改该方法
     * 优化方案：可以使用自定义注解的方式扫描实现类注解的方式动态判断
     * @param type 类型
     * @return
     */
    public static Noodles createNoodles(NoodlesTypeEnum type) {

        try {
            return noodlesTypeEnumClassMap.get(type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}