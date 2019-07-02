package com.latico.designpattern.creational.factory.abstractfactory.animalfactory.impl;

import com.latico.designpattern.creational.factory.abstractfactory.animalfactory.AnimalFactory;
import com.latico.designpattern.creational.factory.abstractfactory.cat.Cat;
import com.latico.designpattern.creational.factory.abstractfactory.cat.impl.white.HomeWhiteCatImpl;
import com.latico.designpattern.creational.factory.abstractfactory.cat.impl.white.KaDingWhiteCatImpl;
import com.latico.designpattern.creational.factory.abstractfactory.dog.Dog;
import com.latico.designpattern.creational.factory.abstractfactory.dog.impl.white.HomeWhiteDogImpl;
import com.latico.designpattern.creational.factory.abstractfactory.dog.impl.white.TaiDiWhiteDogImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 * 黑色动物系列产品线工厂
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:07
 * @Version: 1.0
 */
public class WhiteAnimalFactoryImpl implements AnimalFactory {

    private static final Map<CatTypeEnum, Class<? extends Cat>> catImplMap = new HashMap<>();
    private static final Map<DogTypeEnum, Class<? extends Dog>> dogImplMap = new HashMap<>();
    static {
        //初始化猫实现类
        catImplMap.put(CatTypeEnum.HOME, HomeWhiteCatImpl.class);
        catImplMap.put(CatTypeEnum.KADING, KaDingWhiteCatImpl.class);

        //初始化狗实现类
        dogImplMap.put(DogTypeEnum.HOME, HomeWhiteDogImpl.class);
        dogImplMap.put(DogTypeEnum.TAIDI, TaiDiWhiteDogImpl.class);
    }

    @Override
    public Cat createCat(CatTypeEnum type) {
        try {
            return catImplMap.get(type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Dog createDog(DogTypeEnum type) {
        try {
            return dogImplMap.get(type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
