package com.latico.designpattern.behavioral.responsibilitychain.handler;

import com.latico.designpattern.behavioral.responsibilitychain.request.BecomeFullMemberRequest;
import com.latico.designpattern.behavioral.responsibilitychain.request.TimeOffRequest;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 22:44
 * @Version: 1.0
 */
public interface Handler {

    /**
     * 下一个处理器
     * @param handler
     */
    void setNextHandler(Handler handler);

    /**
     * @param request 请假请求
     */
    void handleRequest(TimeOffRequest request);

    /**
     * @param request 转正请求
     */
    void handleRequest(BecomeFullMemberRequest request);
}
