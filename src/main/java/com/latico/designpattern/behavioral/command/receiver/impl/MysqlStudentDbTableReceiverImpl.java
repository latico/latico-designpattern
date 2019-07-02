package com.latico.designpattern.behavioral.command.receiver.impl;

import com.latico.designpattern.behavioral.command.bean.StudentTable;
import com.latico.designpattern.behavioral.command.receiver.DbTableReceiver;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-17 23:51
 * @Version: 1.0
 */
public class MysqlStudentDbTableReceiverImpl implements DbTableReceiver<StudentTable> {
    @Override
    public void insert(StudentTable student) {
        System.out.println("mysql插入记录:" + student);
    }

    @Override
    public void delete(StudentTable student) {
        System.out.println("mysql删除记录:" + student);
    }
}
