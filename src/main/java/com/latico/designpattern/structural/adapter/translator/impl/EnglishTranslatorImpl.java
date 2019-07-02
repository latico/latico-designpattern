package com.latico.designpattern.structural.adapter.translator.impl;

import com.latico.designpattern.structural.adapter.translator.Translator;

/**
 * <PRE>
 * 英语翻译器
 * </PRE>
 * @Author: LanDingDong
 * @Date: 2019-01-14 20:22:19
 * @Version: 1.0
 */
public class EnglishTranslatorImpl implements Translator {
    /**
     * 为了体现适配器跟代理模式的区别，这里的方法名称不是speakEnglish
     * @param text
     */
    @Override
    public void speak(String text){
        System.out.println("英语翻译器帮忙说英语:" + text);
    }
}
