package com.latico.designpattern.behavioral.iterator;

import com.latico.designpattern.behavioral.iterator.iterator.ListIterator;
import com.latico.designpattern.behavioral.iterator.queue.BuyTicketQueue;
import com.latico.designpattern.behavioral.iterator.queue.impl.BuyTicketQueueImpl;

/**
 * <PRE>
 * 跟JDK的List一样
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 11:38
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BuyTicketQueue<String> queue = new BuyTicketQueueImpl<>();

        queue.add("小明第1个进入队列");
        queue.add("小强第2个进入队列");
        queue.add("小红第3个进入队列");
        queue.add("小丽第4个进入队列");

        System.out.println("传统遍历..................");
        //传统遍历
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }
        System.out.println("==============================");

        System.out.println("迭代器遍历..................");
        //迭代器遍历
        ListIterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============================");

        System.out.println("移除第3个元素后迭代器遍历..................");
        //移除一个后再遍历
        queue.remove(2);
        iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
