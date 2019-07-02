package com.latico.designpattern.behavioral.state;

import com.latico.designpattern.behavioral.state.context.WeatherContext;
import com.latico.designpattern.behavioral.state.context.impl.WeatherContextImpl;
import com.latico.designpattern.behavioral.state.state.WeatherState;
import com.latico.designpattern.behavioral.state.state.impl.SunWeatherStateImpl;

/**
 * <PRE>
 * 跟策略模式差不多，但是上下文类增加了使用状态动态判断进行自动切换策略，对象的某种状态也成为判断的条件
 *
 * 我们是如何区分不同的状态？就是通过每个状态不同的行为来区分，所以不同的状态都有相同的动作，
 * 但是这个动作的执行结果是不同的，而且执行结果还有可能会修改当前的状态。为了体现多态，
 * 摆脱对具体状态类的依赖，使用Context可以动态的替换状态类
 *
 状态模式也有它的缺点，不过它的缺点和大多数模式相似，有两点。

 1、会增加的类的数量。

 2、使系统的复杂性增加。
 尽管状态模式有着这样的缺点，但是往往我们牺牲复杂性去换取的高可维护性和扩展性是相当值得的，除非增加了复杂性以后，对于后者的提升会乎其微。

 状态模式在项目当中也算是较经常会碰到的一个设计模式，但是通常情况下，
 我们还是在看到if else的情况下，对项目进行重构时使用，
 又或者你十分确定要做的项目会朝着状态模式发展，一般情况下，还是不建议在项目的初期使用。

 场景示例：
 1、天气自动切换状态，晴天水汽生成到了一定程度会转变成阴天，阴天的水汽聚集到一定程度会下雨，下雨完了就转晴天
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 18:56
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个天气上下文
        WeatherContext context = new WeatherContextImpl();

        //创建一个状态，作为初始状态
        WeatherState state = new SunWeatherStateImpl(2);

        //把状态添加进来
        context.setWeatherState(state);

        //天气不断演变，会根据发展进度自动调整状态
        context.evolve();
        context.evolve();
        context.evolve();
        context.evolve();
        context.evolve();
        context.evolve();
        context.evolve();
        context.evolve();
        context.evolve();
    }
}
