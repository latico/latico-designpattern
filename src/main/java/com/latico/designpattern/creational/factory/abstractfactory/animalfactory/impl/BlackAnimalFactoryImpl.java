package com.latico.designpattern.creational.factory.abstractfactory.animalfactory.impl;

import com.latico.designpattern.creational.factory.abstractfactory.animalfactory.AnimalFactory;
import com.latico.designpattern.creational.factory.abstractfactory.cat.Cat;
import com.latico.designpattern.creational.factory.abstractfactory.cat.impl.black.HomeBlackCatImpl;
import com.latico.designpattern.creational.factory.abstractfactory.cat.impl.black.KaDingBlackCatImpl;
import com.latico.designpattern.creational.factory.abstractfactory.dog.Dog;
import com.latico.designpattern.creational.factory.abstractfactory.dog.impl.black.HomeBlackDogImpl;
import com.latico.designpattern.creational.factory.abstractfactory.dog.impl.black.TaiDiBlackDogImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 * 白色动物系列产品线工厂
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:07
 * @Version: 1.0
 */
public class BlackAnimalFactoryImpl implements AnimalFactory {

    private static final Map<CatTypeEnum, Class<? extends Cat>> catImplMap = new HashMap<>();
    private static final Map<DogTypeEnum, Class<? extends Dog>> dogImplMap = new HashMap<>();
    static {
        //初始化猫实现类
        catImplMap.put(CatTypeEnum.HOME, HomeBlackCatImpl.class);
        catImplMap.put(CatTypeEnum.KADING, KaDingBlackCatImpl.class);

        //初始化狗实现类
        dogImplMap.put(DogTypeEnum.HOME, HomeBlackDogImpl.class);
        dogImplMap.put(DogTypeEnum.TAIDI, TaiDiBlackDogImpl.class);
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
