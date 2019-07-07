package com.latico.designpattern.behavioral.command;

import com.latico.designpattern.behavioral.command.bean.StudentTable;
import com.latico.designpattern.behavioral.command.bean.UserTable;
import com.latico.designpattern.behavioral.command.command.DbTableCommand;
import com.latico.designpattern.behavioral.command.command.impl.DbTableCommandImpl;
import com.latico.designpattern.behavioral.command.command.impl.StudentDbTableCommandImpl;
import com.latico.designpattern.behavioral.command.command.impl.UserDbTableCommandImpl;
import com.latico.designpattern.behavioral.command.invoker.DbTableInvoker;
import com.latico.designpattern.behavioral.command.receiver.DbTableReceiver;
import com.latico.designpattern.behavioral.command.receiver.impl.MysqlStudentDbTableReceiverImpl;
import com.latico.designpattern.behavioral.command.receiver.impl.MysqlUserDbTableReceiverImpl;
import com.latico.designpattern.behavioral.command.receiver.impl.OracleStudentDbTableReceiverImpl;
import com.latico.designpattern.behavioral.command.receiver.impl.OracleUserDbTableReceiverImpl;

/**
 * <PRE>
 * 业务处理器，命令处理接受者DbTableReceiver，执行真正的业务逻辑，
 * 命令DbTableCommand：存储了DbTableReceiver的执行记录，增强支持undo和redo操作
 * 命令管理和执行器DbTableInvoker：存储了所有命令实例，统一管理，切换实际的命令，帮忙执行
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-18 0:35
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        test1();
//        test2();

    }

    private static void test1() {
        //定义命令的名字
        final String mysqlUserTableCommandName = "mysql-user";
        final String mysqlStudentTableCommandName = "mysql-student";
        final String oracleUserTableCommandName = "oracle-user";
        final String oracleStudentTableCommandName = "oracle-student";

        //创建所有的真正执行业务的命令执行接收器
        DbTableReceiver mysqlUserDbTableReceiver = new MysqlUserDbTableReceiverImpl();
        DbTableReceiver mysqlStudentDbTableReceiver = new MysqlStudentDbTableReceiverImpl();
        DbTableReceiver oracleUserDbTableReceiver = new OracleUserDbTableReceiverImpl();
        DbTableReceiver oracleStudentDbTableReceiver = new OracleStudentDbTableReceiverImpl();

        //创建命令
        DbTableCommand<UserTable> mysqlUserDbTableCommand = new DbTableCommandImpl<UserTable>(mysqlUserDbTableReceiver);
        DbTableCommand<StudentTable> mysqlStudentDbTableCommand = new DbTableCommandImpl<StudentTable>(mysqlStudentDbTableReceiver);
        DbTableCommand<UserTable> oracleUserDbTableCommand = new DbTableCommandImpl<UserTable>(oracleUserDbTableReceiver);
        DbTableCommand<StudentTable> oracleStudentDbTableCommand = new DbTableCommandImpl<StudentTable>(oracleStudentDbTableReceiver);

        //创建一个invoker,执行命令
        DbTableInvoker dbTableInvoker = new DbTableInvoker();

        //把所有的命令加进来
        dbTableInvoker.putCommand(mysqlUserTableCommandName, mysqlUserDbTableCommand);
        dbTableInvoker.putCommand(mysqlStudentTableCommandName, mysqlStudentDbTableCommand);
        dbTableInvoker.putCommand(oracleUserTableCommandName, oracleUserDbTableCommand);
        dbTableInvoker.putCommand(oracleStudentTableCommandName, oracleStudentDbTableCommand);

        System.out.println("///////////////////////////////////////////////");
        //开始测试UserTable，指定切换到某个命令模式
        dbTableInvoker.setCurrentCommand(oracleUserTableCommandName);
        UserTable userXiaoming = new UserTable();
        userXiaoming.setId(1);
        userXiaoming.setName("小明");
        userXiaoming.setAge(10);

        UserTable userXiaoqiang = new UserTable();
        userXiaoqiang.setId(2);
        userXiaoqiang.setName("小强");
        userXiaoqiang.setAge(12);

        dbTableInvoker.execute(userXiaoming);
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.execute(userXiaoqiang);
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.redo();

        System.out.println("///////////////////////////////////////////////");
        //开始测试StudentTable，指定切换到某个命令模式
        dbTableInvoker.setCurrentCommand(mysqlStudentTableCommandName);
        StudentTable studentXiaoli = new StudentTable();
        studentXiaoli.setId(3);
        studentXiaoli.setName("小丽");
        studentXiaoli.setClassName("1班");
        studentXiaoli.setSchoolName("天朝");

        StudentTable studentXiaohong = new StudentTable();
        studentXiaohong.setId(4);
        studentXiaohong.setName("小红");
        studentXiaohong.setClassName("2班");
        studentXiaohong.setSchoolName("天朝");

        dbTableInvoker.execute(studentXiaoli);
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.execute(studentXiaohong);
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.redo();
        System.out.println("///////////////////////////////////////////////");
    }

    private static void test2() {
        //定义命令的名字
        final String mysqlUserTableCommandName = "mysql-user";
        final String mysqlStudentTableCommandName = "mysql-student";
        final String oracleUserTableCommandName = "oracle-user";
        final String oracleStudentTableCommandName = "oracle-student";

        //创建所有的真正执行业务的命令执行接收器
        DbTableReceiver mysqlUserDbTableReceiver = new MysqlUserDbTableReceiverImpl();
        DbTableReceiver mysqlStudentDbTableReceiver = new MysqlStudentDbTableReceiverImpl();
        DbTableReceiver oracleUserDbTableReceiver = new OracleUserDbTableReceiverImpl();
        DbTableReceiver oracleStudentDbTableReceiver = new OracleStudentDbTableReceiverImpl();

        //创建命令
        DbTableCommand mysqlUserDbTableCommand = new UserDbTableCommandImpl(mysqlUserDbTableReceiver);
        DbTableCommand mysqlStudentDbTableCommand = new StudentDbTableCommandImpl(mysqlStudentDbTableReceiver);
        DbTableCommand oracleUserDbTableCommand = new UserDbTableCommandImpl(oracleUserDbTableReceiver);
        DbTableCommand oracleStudentDbTableCommand = new StudentDbTableCommandImpl(oracleStudentDbTableReceiver);

        //创建一个invoker,执行命令
        DbTableInvoker dbTableInvoker = new DbTableInvoker();

        //把所有的命令加进来
        dbTableInvoker.putCommand(mysqlUserTableCommandName, mysqlUserDbTableCommand);
        dbTableInvoker.putCommand(mysqlStudentTableCommandName, mysqlStudentDbTableCommand);
        dbTableInvoker.putCommand(oracleUserTableCommandName, oracleUserDbTableCommand);
        dbTableInvoker.putCommand(oracleStudentTableCommandName, oracleStudentDbTableCommand);

        System.out.println("///////////////////////////////////////////////");
        //开始测试UserTable，指定切换到某个命令模式
        dbTableInvoker.setCurrentCommand(oracleUserTableCommandName);
        UserTable userXiaoming = new UserTable();
        userXiaoming.setId(1);
        userXiaoming.setName("小明");
        userXiaoming.setAge(10);

        UserTable userXiaoqiang = new UserTable();
        userXiaoqiang.setId(2);
        userXiaoqiang.setName("小强");
        userXiaoqiang.setAge(12);

        dbTableInvoker.execute(userXiaoming);
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.execute(userXiaoqiang);
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.redo();

        System.out.println("///////////////////////////////////////////////");
        //开始测试StudentTable，指定切换到某个命令模式
        dbTableInvoker.setCurrentCommand(mysqlStudentTableCommandName);
        StudentTable studentXiaoli = new StudentTable();
        studentXiaoli.setId(3);
        studentXiaoli.setName("小丽");
        studentXiaoli.setClassName("1班");
        studentXiaoli.setSchoolName("天朝");

        StudentTable studentXiaohong = new StudentTable();
        studentXiaohong.setId(4);
        studentXiaohong.setName("小红");
        studentXiaohong.setClassName("2班");
        studentXiaohong.setSchoolName("天朝");

        dbTableInvoker.execute(studentXiaoli);
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.undo();
        dbTableInvoker.execute(studentXiaohong);
        dbTableInvoker.undo();
        dbTableInvoker.redo();
        dbTableInvoker.redo();
        System.out.println("///////////////////////////////////////////////");
    }
}
