package com.latico.designpattern.behavioral.responsibilitychain.handler.impl;

import com.latico.designpattern.behavioral.responsibilitychain.handler.Handler;
import com.latico.designpattern.behavioral.responsibilitychain.request.BecomeFullMemberRequest;
import com.latico.designpattern.behavioral.responsibilitychain.request.TimeOffRequest;

/**
 * <PRE>
 * 部门经理
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 22:50
 * @Version: 1.0
 */
public class ManagerHandlerImpl implements Handler {

    private Handler nextHandler;
    public ManagerHandlerImpl(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(TimeOffRequest request) {

        //只能直接批处理2天内的请假
        if (request.getDays() <= 5) {
            System.out.println("请假天数为:" + request.getDays() +"，部门经理批准请假");
        }else{
            System.out.println("部门经理没有能力处理超过5天的请假审批");
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void handleRequest(BecomeFullMemberRequest request) {
        //只能直接批处理2天内的请假
        if (request.getScore() >= 70) {
            System.out.println("转正得分为:" + request.getScore() +"，部门经理批准转正");
        }else{
            System.out.println("主管没有能力处理低于70分的转正请求");
            nextHandler.handleRequest(request);
        }
    }
}
