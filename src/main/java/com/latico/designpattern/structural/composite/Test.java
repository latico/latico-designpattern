package com.latico.designpattern.structural.composite;

import com.latico.designpattern.structural.composite.employer.Employer;
import com.latico.designpattern.structural.composite.employer.impl.BossEmployerImpl;
import com.latico.designpattern.structural.composite.employer.impl.ManagerEmployerImpl;
import com.latico.designpattern.structural.composite.employer.impl.StaffEmployerImpl;

/**
 * <PRE>
 * 组合器模式
 * 把对象进行关系组合，最终会形成一棵树型结构
 * 示例中是一个公司的员工上下级归属关系树型结构
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 23:28
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Employer bossEmployer = new BossEmployerImpl("王老板");

        Employer chenManagerEmployer = new ManagerEmployerImpl("陈经理");

        Employer liManagerEmployer = new ManagerEmployerImpl("李经理");

        Employer xiaoming = new StaffEmployerImpl("小明");
        Employer xiaohong = new StaffEmployerImpl("小红");
        Employer xiaogang = new StaffEmployerImpl("小刚");

        //两个高管挂在老板下面
        bossEmployer.addSubordinate(chenManagerEmployer);
        bossEmployer.addSubordinate(liManagerEmployer);

        //小明和小红挂陈经理下面
        chenManagerEmployer.addSubordinate(xiaoming);
        chenManagerEmployer.addSubordinate(xiaohong);

        //小刚挂李经理下面
        liManagerEmployer.addSubordinate(xiaogang);

        //输出老板的管理人员体系树形结构
        System.out.println(bossEmployer.toString());

        //输出经理的管理人员体系树形结构
        System.out.println(chenManagerEmployer.toString());
        System.out.println(liManagerEmployer.toString());

        //输出普通员工的管理人员体系树形结构
        System.out.println(xiaoming.toString());
        System.out.println(xiaohong.toString());
        System.out.println(xiaogang.toString());
    }
}
