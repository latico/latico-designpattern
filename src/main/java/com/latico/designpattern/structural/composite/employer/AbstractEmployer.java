package com.latico.designpattern.structural.composite.employer;

import java.util.ArrayList;
import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 23:22:25
 * @Version: 1.0
 */
public abstract class AbstractEmployer implements Employer {

    private String type;
    /**
     * 员工名字
     */
    private String name;

    /**
     * 下属
     */
    public List<Employer> subordinates = new ArrayList<>();

    public AbstractEmployer() {
    }
    public AbstractEmployer(String name) {
        this.name = name;
    }
    /**
     * 添加一个下属
     *
     * @param subordinate
     */
    @Override
    public void addSubordinate(Employer subordinate) {
        this.subordinates.add(subordinate);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employer> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employer> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractEmployer{");
        sb.append("type='").append(type).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", subordinates=").append(subordinates);
        sb.append('}');
        return sb.toString();
    }
}
