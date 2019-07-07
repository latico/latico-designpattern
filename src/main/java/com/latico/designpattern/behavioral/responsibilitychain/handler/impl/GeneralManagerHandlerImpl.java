package com.latico.designpattern.behavioral.responsibilitychain.handler.impl;

import com.latico.designpattern.behavioral.responsibilitychain.handler.Handler;
import com.latico.designpattern.behavioral.responsibilitychain.request.BecomeFullMemberRequest;
import com.latico.designpattern.behavioral.responsibilitychain.request.TimeOffRequest;

/**
 * <PRE>
 * 总经理
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 22:50
 * @Version: 1.0
 */
public class GeneralManagerHandlerImpl implements Handler {
    private Handler nextHandler;
    public GeneralManagerHandlerImpl(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public void setNextHandler(Handler nextHandler) {

        this.nextHandler = nextHandler;
    }
    @Override
    public void handleRequest(TimeOffRequest request) {

        //只能直接批处理2天内的请假
        if (request.getDays() <= 15) {
            System.out.println("请假天数为:" + request.getDays() +"，总经理批准请假");
        }else{
            System.out.println("请假超过15天，总经理需要详情了解情况后再决定是否审批");
        }
    }

    @Override
    public void handleRequest(BecomeFullMemberRequest request) {
        //只能直接批处理2天内的请假
        if (request.getScore() >= 60) {
            System.out.println("转正得分为:" + request.getScore() +"，总经理批准转正");
        }else{
            System.out.println("转正得分不合格，不批准转正");
        }
    }
}
