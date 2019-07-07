package com.latico.designpattern.behavioral.interpreter.expression.impl.nonterminal;

import com.latico.designpattern.behavioral.interpreter.expression.Expression;

import java.util.Map;

/**
 * <PRE>
 * 加号表达式
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 16:21
 * @Version: 1.0
 */
public class AddExpressionImpl implements Expression {

    /**
     * 加号运算法符的左边
     */
    private final Expression left;
    /**
     * 加号运算符的右边
     */
    private final Expression right;

    public AddExpressionImpl(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpreter(Map<String, Integer> variableKeyValue) {
        return left.interpreter(variableKeyValue) + right.interpreter(variableKeyValue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(left).append("[加]").append(right);
        return sb.toString();
    }
}
