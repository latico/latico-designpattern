package com.latico.designpattern.behavioral.iterator.queue.impl;

import com.latico.designpattern.behavioral.iterator.iterator.ListIterator;
import com.latico.designpattern.behavioral.iterator.iterator.impl.ListIteratorImpl;
import com.latico.designpattern.behavioral.iterator.queue.BuyTicketQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-18 10:49
 * @Version: 1.0
 */
public class BuyTicketQueueImpl<T> implements BuyTicketQueue<T> {

    private List<T> list;

    public BuyTicketQueueImpl() {
        list = new ArrayList<>();
    }
    @Override
    public ListIterator iterator() {
        return new ListIteratorImpl(list);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public T remove(int index) {
        return list.remove(index);
    }
}
