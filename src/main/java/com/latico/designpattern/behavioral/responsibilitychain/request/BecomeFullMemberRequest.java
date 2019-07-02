package com.latico.designpattern.behavioral.responsibilitychain.request;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 22:53
 * @Version: 1.0
 */
public class BecomeFullMemberRequest {
    /**
     * 转正的评级得分
     */
    private int score;


    public BecomeFullMemberRequest(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
