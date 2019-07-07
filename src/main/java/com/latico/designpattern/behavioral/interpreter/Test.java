package com.latico.designpattern.behavioral.interpreter;

import com.latico.designpattern.behavioral.interpreter.context.ExpressionContext;
import com.latico.designpattern.behavioral.interpreter.context.impl.AddSubExpressionContextImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 * 示例：支持加减运算的解析器，支持中文作为变量，加减符号为运算符，支持空格
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 16:15
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ExpressionContext context = new AddSubExpressionContextImpl();
        context.analyseExpression("ab +c + d-a + 你好");

        Map<String, Integer> vars = new HashMap<>();
        vars.put("ab", 3);
        vars.put("c", 2);
        vars.put("d", 5);
        vars.put("a", 3);
        vars.put("你好", 5);

        System.out.println(context.runExpression(vars));
    }
}
