package com.latico.designpattern.behavioral.command.command.impl;

import com.latico.designpattern.behavioral.command.bean.StudentTable;
import com.latico.designpattern.behavioral.command.command.DbTableCommand;
import com.latico.designpattern.behavioral.command.receiver.DbTableReceiver;

import java.util.LinkedList;

/**
 * <PRE>
 * 已使用泛型类{@link DbTableCommandImpl}进行优化，该类弃用
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 22:34
 * @Version: 1.0
 */
@Deprecated
public class StudentDbTableCommandImpl implements DbTableCommand<StudentTable> {

    private final DbTableReceiver receiver;

    /**
     * 撤销队列
     */
    private LinkedList<StudentTable> undoQueue;

    /**
     * 重做队列
     */
    private LinkedList<StudentTable> redoQueue;

    public StudentDbTableCommandImpl(DbTableReceiver receiver) {

        this.receiver = receiver;
        this.undoQueue = new LinkedList<>();
        this.redoQueue = new LinkedList<>();
    }
    @Override
    public void execute(StudentTable user) {
        receiver.insert(user);
        undoQueue.addFirst(user);
        System.out.println("数据入了撤销队列");
    }

    @Override
    public void undo() {
        StudentTable user = undoQueue.pollFirst();
        if (user == null) {
            System.out.println("撤销队列没有拿到数据");
        } else {
            receiver.delete(user);

            //因为删除了，所以加进重做队列允许重新入库
            this.redoQueue.addFirst(user);
            System.out.println("数据入了重做队列");
        }
    }

    @Override
    public void redo() {
        StudentTable user = redoQueue.pollFirst();
        if (user == null) {
            System.out.println("重做队列没有拿到数据");
        } else {
            receiver.insert(user);
            //因为重新入库了，所以加进撤销队列允许撤销
            this.undoQueue.addFirst(user);
            System.out.println("数据入了撤销队列");
        }
    }
}
