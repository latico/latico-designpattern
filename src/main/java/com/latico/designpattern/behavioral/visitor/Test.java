package com.latico.designpattern.behavioral.visitor;

import com.latico.designpattern.behavioral.visitor.element.impl.ConsumeBillElementImpl;
import com.latico.designpattern.behavioral.visitor.element.impl.IncomBillElementImpl;
import com.latico.designpattern.behavioral.visitor.objectstruture.AccountBook;
import com.latico.designpattern.behavioral.visitor.objectstruture.impl.AccountBookImpl;
import com.latico.designpattern.behavioral.visitor.visitor.impl.AccountantBillVisitorImpl;
import com.latico.designpattern.behavioral.visitor.visitor.impl.BossBillVisitorImpl;

/**
 * <PRE>
 * 场景：
 * 有支出和收入账单作为被访问元素存放到账本中，有老板和会计师两个访问者，
 * 访问者通过账本来访问账单，老板拿到账单后会把总收入和总支出缓存起来，供自己访问，
 * 会计师只是审核操作。
 *
 * （1）Visitor：访问者，接口或者抽象类，它定义了对每一个元素（Element）访问的行为，它的参数就是可以访问的元素，它的方法数理论上来讲与元素个数是一样的，因此，访问者模式要求元素的类族要稳定，如果经常添加、移除元素类，必然会导致频繁地修改Visitor接口，如果这样则不适合使用访问者模式。
 * （2）ConcreteVisitor：老板/会计师，具体的访问类，它需要给出对每一个元素类访问时所产生的具体行为。
 * （3）Element：账单，元素接口或者抽象类，它定义了一个接受访问者的方法（Accept），其意义是指每一个元素都要可以被访问者访问。
 * （4）ConcreteElement：收入账单/支出账单，具体的元素类，它提供接受访问方法的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法。
 * （5）ObjectStructure：账本，定义当中所说的对象结构，对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素供访问者访问。
 *
 访问者模式并不是那么完美，它也有着致命的缺陷：增加新的元素类比较困难。
 通过访问者模式的代码可以看到，在访问者类中，每一个元素类都有它对应的处理方法，
 也就是说，每增加一个元素类都需要修改访问者类（也包括访问者类的子类或者实现类），
 修改起来相当麻烦。也就是说，在元素类数目不确定的情况下，应该慎用访问者模式。
 所以，访问者模式比较适用于对已有功能的重构，比如说，一个项目的基本功能已经确定下来，
 元素类的数据已经基本确定下来不会变了，会变的只是这些元素内的相关操作，
 这时候，我们可以使用访问者模式对原有的代码进行重构一遍，这样一来，
 就可以在不修改各个元素类的情况下，对原有功能进行修改。
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-20 0:31
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        //创建账本
        AccountBook accountBook = new AccountBookImpl();

        //创建卖车账单信息
        final String carIncomBillElementName = "卖出2台车收入";
        final String carConsumeBillElementName = "卖出2台车成本";
        IncomBillElementImpl carIncomBillElement = new IncomBillElementImpl(carIncomBillElementName, 50000);
        ConsumeBillElementImpl carConsumeBillElement = new ConsumeBillElementImpl(carConsumeBillElementName, 30000);

        //把卖车账单添加到账本中
        accountBook.addBillElement(carIncomBillElement.getItemName(), carIncomBillElement);
        accountBook.addBillElement(carConsumeBillElement.getItemName(), carConsumeBillElement);

        //创建卖房账单信息
        final String houseIncomBillElementName = "卖出1个房子收入";
        final String houseConsumeBillElementName = "卖出1个房子成本";
        IncomBillElementImpl houseIncomBillElement = new IncomBillElementImpl(houseIncomBillElementName, 150000);
        ConsumeBillElementImpl houseConsumeBillElement = new ConsumeBillElementImpl(houseConsumeBillElementName, 100000);

        //把卖房账单添加到账本中
        accountBook.addBillElement(houseIncomBillElement.getItemName(), houseIncomBillElement);
        accountBook.addBillElement(houseConsumeBillElement.getItemName(), houseConsumeBillElement);

        //创建访问者信息，老板和会计师
        BossBillVisitorImpl bossBillVisitorImpl = new BossBillVisitorImpl();
        AccountantBillVisitorImpl accountantBillVisitorImpl = new AccountantBillVisitorImpl();

        //老板通过账本访问信息
        accountBook.viewAllBillElement(bossBillVisitorImpl);
        //打印老板获取到的总收入和总支出的数据缓存
        System.out.println(bossBillVisitorImpl.getTotalIncom());
        System.out.println(bossBillVisitorImpl.getTotalConsume());

        System.out.println("===================");
        //会计师通过账本审核账单
        accountBook.viewAllBillElement(accountantBillVisitorImpl);

        System.out.println("===================");
        //老板清空缓存，通过指定账单名称只访问卖方信息
        bossBillVisitorImpl.clearCahce();
        accountBook.viewBillElement(houseIncomBillElementName, bossBillVisitorImpl);
        //打印老板获取到的总收入和总支出的数据缓存
        System.out.println(bossBillVisitorImpl.getTotalIncom());
        System.out.println(bossBillVisitorImpl.getTotalConsume());
        System.out.println("===================");

    }
}
