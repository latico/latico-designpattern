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
public class StudentTable {
    private int id;
    private String name;
    private String className;
    private String schoolName;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentTable{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", className='").append(className).append('\'');
        sb.append(", schoolName='").append(schoolName).append('\'');
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
