package com.latico.designpattern.behavioral.iterator.iterator;

/**
 * <PRE>
 * 用户只需要得到迭代器就可以遍历，而对于遍历算法则不用去关心
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 10:36
 * @Version: 1.0
 */
public interface ListIterator<T> {
    /**
     * 是否有下一个
     * @return
     */
    boolean hasNext();

    /**
     * 下一个
     * @return
     */
    T next();

}
