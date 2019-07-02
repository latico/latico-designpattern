package com.latico.designpattern.behavioral.interpreter.context.impl;

import com.latico.designpattern.behavioral.interpreter.context.ExpressionContext;
import com.latico.designpattern.behavioral.interpreter.expression.Expression;
import com.latico.designpattern.behavioral.interpreter.expression.impl.nonterminal.AddExpressionImpl;
import com.latico.designpattern.behavioral.interpreter.expression.impl.nonterminal.SubtractExpressionImpl;
import com.latico.designpattern.behavioral.interpreter.expression.impl.terimal.VariableExpressionImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <PRE>
 * 加减表达式简单实现，支持中文和空格，不支持小括号
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 16:27
 * @Version: 1.0
 */
public class AddSubExpressionContextImpl implements ExpressionContext {
    private Expression expression;
    private String expressionStr;

    @Override
    public void analyseExpression(String expressionStr) {
        this.expressionStr = expressionStr;

        //先把空格都去掉
        expressionStr = expressionStr.replace(" ", "");

        //根据终结符和非终结符进行分割
        List<String> list = new ArrayList<>();

        char[] chars = expressionStr.toCharArray();
        String str = "";
        for (char aChar : chars) {
            if (aChar == '+' || aChar == '-') {
                list.add(str);
                list.add(aChar + "");
                str = "";
            }else{
                str += aChar;
            }
        }
        list.add(str);
        System.out.println("表达式切割分离后得到变量和运算符分离:" + list);

        Expression expression = null;
        for (int i = 0; i < list.size(); i++) {
            String currentStr = list.get(i);

            //加号逻辑处理
            if ("+".equals(currentStr)) {
                //后移一位获取减号后面的变量作为表达式右边
                Expression right = new VariableExpressionImpl(list.get(++i));

                //结合上次的表达式结果和下一个变量计算得到最新的表达式
                expression = new AddExpressionImpl(expression, right);

                //减号逻辑处理
            } else if ("-".equals(currentStr)) {

                //后移一位获取减号后面的变量作为表达式右边
                Expression right = new VariableExpressionImpl(list.get(++i));

                //结合上次的表达式结果和下一个变量计算得到最新的表达式
                expression = new SubtractExpressionImpl(expression, right);

                //变量的时候处理
            }else{
                expression = new VariableExpressionImpl(currentStr);
            }
        }

        this.expression = expression;

        System.out.println("解析后的表达式:" + this.expression);
    }

    @Override
    public int runExpression(Map<String, Integer> variableKeyValue) {
        return expression.interpreter(variableKeyValue);
    }
}
