package com.latico.designpattern.behavioral.command.receiver.impl;

import com.latico.designpattern.behavioral.command.bean.StudentTable;
import com.latico.designpattern.behavioral.command.receiver.DbTableReceiver;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 23:51
 * @Version: 1.0
 */
public class OracleStudentDbTableReceiverImpl implements DbTableReceiver<StudentTable> {
    @Override
    public void insert(StudentTable student) {
        System.out.println("oracle插入记录:" + student);
    }

    @Override
    public void delete(StudentTable student) {
        System.out.println("oracle删除记录:" + student);
    }
}
