package com.latico.designpattern.behavioral.visitor.objectstruture;

import com.latico.designpattern.behavioral.visitor.element.BillElement;
import com.latico.designpattern.behavioral.visitor.visitor.BillVisitor;

/**
 * <PRE>
 * 账本类，管理账单，访问者通过账本访问账单
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-20 1:30
 * @Version: 1.0
 */
public interface AccountBook {

    /**
     * 添加账单
     * @param billElement
     */
    void addBillElement(String billName, BillElement billElement);

    /**
     * 删除账单
     */
    BillElement removeBillElement(String billName);

    /**
     * 查看所有账单
     * @param visitor 访问者
     */
    void viewAllBillElement(BillVisitor visitor);

    /**
     * 指定账单名称查看账单
     * @param billName 账单名称
     * @param visitor
     */
    void viewBillElement(String billName, BillVisitor visitor);
}
