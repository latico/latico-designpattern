package com.latico.designpattern.creational.builder.bean;

/**
 * <PRE>
 *  人产品
 * </PRE>
 * @Author: LanDingDong
 * @Date: 2019-01-14 17:23:13
 * @Version: 1.0
 */
public class PersonProduct {

    private String type;

    private String head;

    private String body;
    
    private String foot;

    public PersonProduct(String type, String head, String body, String foot) {
        this.type = type;
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public String getFoot() {
        return foot;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonProduct{");
        sb.append("type='").append(type).append('\'');
        sb.append(", head='").append(head).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", foot='").append(foot).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
