package com.latico.designpattern.behavioral.command.bean;

/**
 * <PRE>
 * user表
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-17 23:49
 * @Version: 1.0
 */
public class UserTable {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserTable{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
