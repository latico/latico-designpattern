package com.latico.designpattern.behavioral.visitor.element.impl;

import com.latico.designpattern.behavioral.visitor.element.BillElement;
import com.latico.designpattern.behavioral.visitor.visitor.BillVisitor;

/**
 * <PRE>
 * 支出账单
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-20 0:34
 * @Version: 1.0
 */
public class ConsumeBillElementImpl implements BillElement {

    /**
     * 账单总数
     */
    private int amount;

    private String itemName = "支出账单";

    public ConsumeBillElementImpl(String itemName, int amount) {
        this.amount = amount;
        this.itemName = itemName;
    }

    @Override
    public void accept(BillVisitor visitor) {
        System.out.println("把支出账单做一些处理后传给访问者:" + visitor.getName());
        visitor.visit(this);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConsumeBillElementImpl{");
        sb.append("amount=").append(amount);
        sb.append(", itemName='").append(itemName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
