package com.latico.designpattern.behavioral.visitor.visitor.impl;

import com.latico.designpattern.behavioral.visitor.element.impl.ConsumeBillElementImpl;
import com.latico.designpattern.behavioral.visitor.element.impl.IncomBillElementImpl;
import com.latico.designpattern.behavioral.visitor.visitor.BillVisitor;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-20 0:37
 * @Version: 1.0
 */
public class BossBillVisitorImpl implements BillVisitor {

    /**
     * 总收入
     */
    private int totalIncom;
    /**
     * 总支出
     */
    private int totalConsume;
    @Override
    public void visit(IncomBillElementImpl billElement) {
        //累加
        this.totalIncom += billElement.getAmount();

        System.out.println("老板拿到总收入信息并累加缓存起来:" + billElement);
    }

    @Override
    public void visit(ConsumeBillElementImpl billElement) {
        //累加
        this.totalConsume += billElement.getAmount();

        System.out.println("老板拿到总支出信息并累加缓存起来:" + billElement);
    }

    /**
     * @return 总收入
     */
    public int getTotalIncom() {
        return totalIncom;
    }

    /**
     * @return 总支出
     */
    public int getTotalConsume() {
        return totalConsume;
    }

    @Override
    public String getName() {
        return "老板";
    }

    public void clearCahce() {
        System.out.println("老板清空计算缓存");
        totalConsume = 0;
        totalIncom = 0;
    }
}
