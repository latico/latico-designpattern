package com.latico.designpattern.behavioral.command.command.impl;

import com.latico.designpattern.behavioral.command.command.DbTableCommand;
import com.latico.designpattern.behavioral.command.receiver.DbTableReceiver;

import java.util.LinkedList;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 9:00
 * @Version: 1.0
 */
public class DbTableCommandImpl<TABLE> implements DbTableCommand<TABLE> {

    private final DbTableReceiver<TABLE> receiver;

    /**
     * 撤销队列
     */
    private LinkedList<TABLE> undoQueue;

    /**
     * 重做队列
     */
    private LinkedList<TABLE> redoQueue;

    public DbTableCommandImpl(DbTableReceiver<TABLE> receiver) {

        this.receiver = receiver;
        this.undoQueue = new LinkedList<>();
        this.redoQueue = new LinkedList<>();
    }
    @Override
    public void execute(TABLE dataObj) {
        receiver.insert(dataObj);
        undoQueue.addFirst(dataObj);
        System.out.println("数据入了撤销队列");
    }

    @Override
    public void undo() {
        TABLE dataObj = undoQueue.pollFirst();
        if (dataObj == null) {
            System.out.println("撤销队列没有拿到数据");
        } else {
            receiver.delete(dataObj);

            //因为删除了，所以加进重做队列允许重新入库
            this.redoQueue.addFirst(dataObj);
            System.out.println("数据入了重做队列");
        }
    }

    @Override
    public void redo() {
        TABLE dataObj = redoQueue.pollFirst();
        if (dataObj == null) {
            System.out.println("重做队列没有拿到数据");
        } else {
            receiver.insert(dataObj);
            //因为重新入库了，所以加进撤销队列允许撤销
            this.undoQueue.addFirst(dataObj);
            System.out.println("数据入了撤销队列");
        }
    }
}
