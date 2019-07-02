package com.latico.designpattern.behavioral.interpreter.expression.impl.terimal;

import com.latico.designpattern.behavioral.interpreter.expression.Expression;

import java.util.Map;

/**
 * <PRE>
 * 变量表达式，也就是根据变量名称获取值，
 * 终结符表达式
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 16:18
 * @Version: 1.0
 */
public class VariableExpressionImpl implements Expression {

    private final String variableName;

    public VariableExpressionImpl(String variableName) {
        this.variableName = variableName;
    }
    @Override
    public int interpreter(Map<String, Integer> variableKeyValue) {
        return variableKeyValue.get(variableName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(variableName);
        return sb.toString();
    }
}
