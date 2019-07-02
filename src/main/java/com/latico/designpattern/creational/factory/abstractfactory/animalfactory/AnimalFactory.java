package com.latico.designpattern.creational.factory.abstractfactory.animalfactory;

import com.latico.designpattern.creational.factory.abstractfactory.cat.Cat;
import com.latico.designpattern.creational.factory.abstractfactory.dog.Dog;

/**
 * <PRE>
 * 工厂接口
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:05
 * @Version: 1.0
 */
public interface AnimalFactory {
    public enum CatTypeEnum{
        /**
         * 卡丁猫
         */
        KADING,

        /**
         * 家猫
         */
        HOME,
        ;
    }
    public enum DogTypeEnum{
        /**
         * 泰迪狗
         */
        TAIDI,

        /**
         * 家狗
         */
        HOME,
        ;
    }

    Cat createCat(CatTypeEnum type);

    Dog createDog(DogTypeEnum type);
}
