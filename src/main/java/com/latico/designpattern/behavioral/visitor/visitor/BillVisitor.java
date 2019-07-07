package com.latico.designpattern.behavioral.visitor.visitor;

import com.latico.designpattern.behavioral.visitor.element.impl.ConsumeBillElementImpl;
import com.latico.designpattern.behavioral.visitor.element.impl.IncomBillElementImpl;

/**
 * <PRE>
 * 账单访问者
 *
 * Visitor：接口或者抽象类，它定义了对每一个元素（Element）访问的行为，
 * 它的参数就是可以访问的元素，它的方法数理论上来讲与元素个数是一样的，因此，
 * 访问者模式要求元素的类族要稳定，如果经常添加、移除元素类，必然会导致频繁地修改Visitor接口，
 * 如果这样则不适合使用访问者模式
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-20 0:31
 * @Version: 1.0
 */
public interface BillVisitor {
    /**
     * 让Element调用
     */
    void visit(IncomBillElementImpl billElement);

    /**
     * @param billElement
     */
    void visit(ConsumeBillElementImpl billElement);

    /**
     * @return 访问者名字
     */
    String getName();
}
