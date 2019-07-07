package com.latico.designpattern.behavioral.visitor.visitor.impl;

import com.latico.designpattern.behavioral.visitor.element.impl.ConsumeBillElementImpl;
import com.latico.designpattern.behavioral.visitor.element.impl.IncomBillElementImpl;
import com.latico.designpattern.behavioral.visitor.visitor.BillVisitor;

/**
 * <PRE>
 * 会计师访问者
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-20 0:37
 * @Version: 1.0
 */
public class AccountantBillVisitorImpl implements BillVisitor {

    @Override
    public void visit(IncomBillElementImpl billElement) {
        System.out.println("会计师审核收入账单:" + billElement);
    }

    @Override
    public void visit(ConsumeBillElementImpl billElement) {
        System.out.println("会计师审核支出账单:" + billElement);
    }

    @Override
    public String getName() {
        return "会计师";
    }

}
