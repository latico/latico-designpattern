package com.latico.designpattern.behavioral.visitor.objectstruture.impl;

import com.latico.designpattern.behavioral.visitor.element.BillElement;
import com.latico.designpattern.behavioral.visitor.objectstruture.AccountBook;
import com.latico.designpattern.behavioral.visitor.visitor.BillVisitor;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-20 1:36
 * @Version: 1.0
 */
public class AccountBookImpl implements AccountBook {

    private Map<String, BillElement> billNameMap;

    public AccountBookImpl() {
        billNameMap = new HashMap<>();
    }
    @Override
    public void addBillElement(String billName, BillElement billElement) {
        billNameMap.put(billName, billElement);
    }

    @Override
    public BillElement removeBillElement(String billName) {
        return billNameMap.remove(billName);
    }

    @Override
    public void viewAllBillElement(BillVisitor visitor) {
        for (Map.Entry<String, BillElement> entry : billNameMap.entrySet()) {
            entry.getValue().accept(visitor);
        }
    }

    @Override
    public void viewBillElement(String billName, BillVisitor visitor) {
        BillElement billElement = billNameMap.get(billName);
        billElement.accept(visitor);
    }
}
