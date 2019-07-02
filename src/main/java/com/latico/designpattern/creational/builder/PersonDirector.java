package com.latico.designpattern.creational.builder;

import com.latico.designpattern.creational.builder.bean.PersonProduct;
import com.latico.designpattern.creational.builder.personbuilder.PersonBuilder;

/**
 * <PRE>
 * 选择性决定具体调用了Builder哪些方法进行建造，
 * 在实际开发中，大多数情况下，不使用这层
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-14 17:28:02
 * @Version: 1.0
 */
public class PersonDirector {

    /**
     * 生产漂亮的
     * 可以控制生产零件的顺序，或者只生产某一部分零件，最后调用组装接口返回整个对象
     *
     * @param pb
     * @return
     */
    public PersonProduct constructBeautifulPerson(PersonBuilder pb) {

        pb.buildType("漂亮类型").buildHead("长发飘飘").buildBody("苗条").buildFoot("大长腿");
        return pb.build();

    }

    /**
     * 生产丑的
     * 可以控制生产零件的顺序，或者只生产某一部分零件，最后调用组装接口返回整个对象
     *
     * @param pb
     * @return
     */
    public PersonProduct constructUglyPerson(PersonBuilder pb) {

        pb.buildType("丑陋类型").buildHead("凌乱").buildBody("肥胖").buildFoot("短粗");
        return pb.build();

    }

    /**
     * 生产丑的
     * 可以控制生产零件的顺序，或者只生产某一部分零件，最后调用组装接口返回整个对象
     *
     * @param pb
     * @return
     */
    public PersonProduct constructDefaultPerson(PersonBuilder pb) {

        pb.buildType("标准类型");
        return pb.build();

    }
}
