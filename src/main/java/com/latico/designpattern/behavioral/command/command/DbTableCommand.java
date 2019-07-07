package com.latico.designpattern.behavioral.command.command;

/**
 * <PRE>
 * 定义执行命令
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 22:32
 * @Version: 1.0
 */
public interface DbTableCommand<TABLE> {
    /**
     * 执行，执行完后，把任务添加到撤销队列
     */
    void execute(TABLE dataObj);

    /**
     * 撤销，应该要使用后进先出原则，从撤销队列中执行任务，执行完后，把任务移到重做队列
     */
    void undo();

    /**
     * 重做，应该要使用后进先出原则，从重做队列中执行任务，执行完后，把任务移到撤销队列
     */
    void redo();
}
