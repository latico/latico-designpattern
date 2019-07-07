package com.latico.designpattern.behavioral.iterator.iterator.impl;

import com.latico.designpattern.behavioral.iterator.iterator.ListIterator;

import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 10:39
 * @Version: 1.0
 */
public class ListIteratorImpl<T> implements ListIterator<T> {
    private final List<T> list;
    private int index;

    public ListIteratorImpl(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
