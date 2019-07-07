package com.latico.designpattern.structural.adapter.translator.impl;

import com.latico.designpattern.structural.adapter.translator.Translator;

/**
 * <PRE>
 * 日语翻译器
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 20:21
 * @Version: 1.0
 */
public class JapaneseTranslatorImpl implements Translator {

    /**
     * 为了体现适配器跟代理模式的区别，这里的方法名称不是speakJapanese
     * @param text
     */
    @Override
    public void speak(String text){
        System.out.println("日语翻译器帮忙说日语:" + text);
    }
}
