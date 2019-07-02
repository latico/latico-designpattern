package com.latico.designpattern.behavioral.responsibilitychain.request;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 22:47
 * @Version: 1.0
 */
public class TimeOffRequest {
    /**
     * 请假天数
     */
    private int days;

    public TimeOffRequest(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

}
