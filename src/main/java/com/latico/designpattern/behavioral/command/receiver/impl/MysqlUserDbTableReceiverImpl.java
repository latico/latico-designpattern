package com.latico.designpattern.behavioral.command.receiver.impl;

import com.latico.designpattern.behavioral.command.bean.UserTable;
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
public class MysqlUserDbTableReceiverImpl implements DbTableReceiver<UserTable> {
    @Override
    public void insert(UserTable user) {
        System.out.println("mysql插入记录:" + user);
    }

    @Override
    public void delete(UserTable user) {
        System.out.println("mysql删除记录:" + user);
    }
}
