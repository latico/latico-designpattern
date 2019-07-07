package com.latico.designpattern.behavioral.command.receiver;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 22:35
 * @Version: 1.0
 */
public interface DbTableReceiver<TABLE> {

    void insert(TABLE dataObj);

    void delete(TABLE dataObj);
}
