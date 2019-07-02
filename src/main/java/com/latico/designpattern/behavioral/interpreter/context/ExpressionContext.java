package com.latico.designpattern.behavioral.interpreter.context;

import java.util.Map;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 16:24
 * @Version: 1.0
 */
public interface ExpressionContext {

    /**
     * 解析表达式
     */
    void analyseExpression(String expressionStr);

    /**
     * 运行表达式
     * @param variableKeyValue
     * @return
     */
    int runExpression(Map<String, Integer> variableKeyValue);
}
