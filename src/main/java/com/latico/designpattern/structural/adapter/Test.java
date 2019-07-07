package com.latico.designpattern.structural.adapter;

import com.latico.designpattern.structural.adapter.speakskill.SpeakSkill;
import com.latico.designpattern.structural.adapter.speakskill.impl.SpeakSkillImpl;
import com.latico.designpattern.structural.adapter.translator.impl.EnglishTranslatorImpl;
import com.latico.designpattern.structural.adapter.translator.impl.JapaneseTranslatorImpl;

/**
 * <PRE>
 * 场景：自身只会说中文，需要借助翻译器来帮自己说其他语言
 *
 * 适配器模式是会传入多个辅助对象，而桥接模式只会传入一个
 *
 * 对于要实现的部分接口，自身没有能力或者不想实现，直接把第三方类对象传进来，通过调用它帮忙实现。
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 20:25
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建英语翻译器帮手
        EnglishTranslatorImpl englishTranslator = new EnglishTranslatorImpl();
        //创建日语翻译器帮手
        JapaneseTranslatorImpl japaneseTranslator = new JapaneseTranslatorImpl();

        //传入实现类中供它使用增强功能
        SpeakSkill speakSkill = new SpeakSkillImpl(englishTranslator, japaneseTranslator);

        speakSkill.speakChinese("你好啊");
        speakSkill.speakEnglish("hello");
        speakSkill.speakJapanese("やめて");
    }
}
