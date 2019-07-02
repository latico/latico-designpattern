package com.latico.designpattern.creational.factory.abstractfactory;

import com.latico.designpattern.creational.factory.abstractfactory.animalfactory.AnimalFactory;
import com.latico.designpattern.creational.factory.abstractfactory.animalfactory.impl.BlackAnimalFactoryImpl;
import com.latico.designpattern.creational.factory.abstractfactory.animalfactory.impl.WhiteAnimalFactoryImpl;

/**
 * <PRE>
 * 抽象工厂，最完整的工厂类，工厂中还有工厂，里面的那层工厂一般就是按照产品线划分，
 * 比如示例中是白色系列和黑色系列的猫和狗，每个系列工厂里面又有不同种类的猫和狗
 *
 抽象工厂是在抽象方法的基础上再封装了一层，主要是区分出产品线工厂层，比如示例中，
 白色动物系列工厂和黑色动物工厂，是两个产品线。
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 16:53
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //测试白猫系列
        AnimalFactory animalFactory = new WhiteAnimalFactoryImpl();
        animalFactory.createCat(AnimalFactory.CatTypeEnum.HOME).eat();
        animalFactory.createCat(AnimalFactory.CatTypeEnum.KADING).eat();

        animalFactory.createDog(AnimalFactory.DogTypeEnum.HOME).eat();
        animalFactory.createDog(AnimalFactory.DogTypeEnum.TAIDI).eat();

        //测试黑猫系列
        animalFactory = new BlackAnimalFactoryImpl();
        animalFactory.createCat(AnimalFactory.CatTypeEnum.HOME).eat();
        animalFactory.createCat(AnimalFactory.CatTypeEnum.KADING).eat();

        animalFactory.createDog(AnimalFactory.DogTypeEnum.HOME).eat();
        animalFactory.createDog(AnimalFactory.DogTypeEnum.TAIDI).eat();
    }
}
