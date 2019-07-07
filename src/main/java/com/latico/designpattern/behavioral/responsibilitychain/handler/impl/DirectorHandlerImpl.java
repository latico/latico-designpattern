package com.latico.designpattern.behavioral.responsibilitychain.handler.impl;

import com.latico.designpattern.behavioral.responsibilitychain.handler.Handler;
import com.latico.designpattern.behavioral.responsibilitychain.request.BecomeFullMemberRequest;
import com.latico.designpattern.behavioral.responsibilitychain.request.TimeOffRequest;

/**
 * <PRE>
 * 主管
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 22:50
 * @Version: 1.0
 */
public class DirectorHandlerImpl implements Handler {

    private Handler nextHandler;

    public DirectorHandlerImpl(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(TimeOffRequest request) {

        //只能直接批处理2天内的请假
        if (request.getDays() <= 2) {
            System.out.println("请假天数为:" + request.getDays() +"，主管批准请假");
        }else{
            System.out.println("主管没有能力处理超过2天的请假审批");
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void handleRequest(BecomeFullMemberRequest request) {
        //只能直接批处理2天内的请假
        if (request.getScore() >= 90) {
            System.out.println("转正得分为:" + request.getScore() +"，主管批准转正");
        }else{
            System.out.println("主管没有能力处理低于90分的转正请求");
            nextHandler.handleRequest(request);
        }
    }
}
