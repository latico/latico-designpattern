package com.latico.designpattern.behavioral.command.invoker;

import com.latico.designpattern.behavioral.command.command.DbTableCommand;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 * 统一命令管理和命令执行，该对象一般不要多线程操作
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-18 0:11
 * @Version: 1.0
 */
public class DbTableInvoker {
    /**
     * 管理的所有命令集合
     */
    private Map<String, DbTableCommand> commands;

    /**
     * 当前正在使用的命令
     */
    private DbTableCommand currentCommand;

    public DbTableInvoker() {
        this.commands = new HashMap<>();
    }

    /**
     * 添加一个命令到命令集合
     * @param commandName
     * @param command
     */
    public void putCommand(String commandName, DbTableCommand command) {
        commands.put(commandName, command);
    }

    /**
     * 设置当前使用的命令
     * @param commandName
     */
    public void setCurrentCommand(String commandName) {
        this.currentCommand = commands.get(commandName);
    }

    /**
     * @param obj 执行一个命令
     */
    public void execute(Object obj) {
        currentCommand.execute(obj);
    }


    /**
     * 撤销
     */
    public void undo() {
        currentCommand.undo();
    }

    /**
     * 重做
     */
    public void redo() {
        currentCommand.redo();
    }
}
