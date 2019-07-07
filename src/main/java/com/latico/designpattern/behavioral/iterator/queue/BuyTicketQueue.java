package com.latico.designpattern.behavioral.iterator.queue;

import com.latico.designpattern.behavioral.iterator.iterator.ListIterator;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 10:46
 * @Version: 1.0
 */
public interface BuyTicketQueue<T> {

    /**
     * 提供一个获取迭代器的方法
     * @return
     */
    ListIterator iterator();

    /**
     * 获取大小
     * @return
     */
    int size();

    /**
     * 指定索引，获取一个
     * @param index
     * @return
     */
    T get(int index);

    /**
     * 添加一个
     * @param obj
     */
    void add(T obj);

    /**
     * 指定索引移开一个
     * @param index
     * @return
     */
    T remove(int index);
}
