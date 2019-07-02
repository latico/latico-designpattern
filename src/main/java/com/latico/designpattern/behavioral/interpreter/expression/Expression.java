package com.latico.designpattern.behavioral.interpreter.expression;

import java.util.Map;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 16:16
 * @Version: 1.0
 */
public interface Expression {

    /**
     * 传入变量解析
     * @param variableKeyValue
     * @return
     */
    int interpreter(Map<String, Integer> variableKeyValue);
}
