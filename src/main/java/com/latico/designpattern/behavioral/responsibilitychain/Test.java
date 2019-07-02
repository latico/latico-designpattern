package com.latico.designpattern.behavioral.responsibilitychain;

import com.latico.designpattern.behavioral.responsibilitychain.handler.Handler;
import com.latico.designpattern.behavioral.responsibilitychain.handler.impl.DirectorHandlerImpl;
import com.latico.designpattern.behavioral.responsibilitychain.handler.impl.GeneralManagerHandlerImpl;
import com.latico.designpattern.behavioral.responsibilitychain.handler.impl.ManagerHandlerImpl;
import com.latico.designpattern.behavioral.responsibilitychain.request.BecomeFullMemberRequest;
import com.latico.designpattern.behavioral.responsibilitychain.request.TimeOffRequest;

/**
 * <PRE>
 * 场景：主管、部门经理、总经理，作为一个职责链，审批请假和转正请求，
 * 当某个处理者没有能力处理当前职责的时候，传递给下一个处理者
 *
 * 职责链模式跟装饰者模式不一样，职责链只要在链上某个节点处理了就完成，
 * 装饰者一般不需要控制顺序，而且肯定会顺利执行所有装饰方法，
 * 装饰者只是为了装饰业务，而职责链是为了做某个业务但是不知道谁能做。
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 22:42
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建处理职责链
        Handler generalManagerHandlerImpl = new GeneralManagerHandlerImpl(null);
        Handler managerHandlerImpl = new ManagerHandlerImpl(generalManagerHandlerImpl);
        Handler directorHandlerImpl = new DirectorHandlerImpl(managerHandlerImpl);

        //创建请假事件
        TimeOffRequest timeOffRequest = new TimeOffRequest(5);

        //创建转正事件
        BecomeFullMemberRequest becomeFullMemberRequest = new BecomeFullMemberRequest(71);

        //用职责链最前的一个处理者执行请求
        directorHandlerImpl.handleRequest(timeOffRequest);
        directorHandlerImpl.handleRequest(becomeFullMemberRequest);

    }
}
