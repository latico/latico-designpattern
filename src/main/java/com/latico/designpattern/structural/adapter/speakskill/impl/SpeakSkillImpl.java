package com.latico.designpattern.structural.adapter.speakskill.impl;

import com.latico.designpattern.structural.adapter.speakskill.SpeakSkill;
import com.latico.designpattern.structural.adapter.translator.impl.EnglishTranslatorImpl;
import com.latico.designpattern.structural.adapter.translator.impl.JapaneseTranslatorImpl;

/**
 * <PRE>
 *
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 20:23:03
 * @Version: 1.0
 */
public class SpeakSkillImpl implements SpeakSkill {

    private final EnglishTranslatorImpl englishTranslator;
    private final JapaneseTranslatorImpl japaneseTranslator;

    public SpeakSkillImpl(EnglishTranslatorImpl englishTranslator, JapaneseTranslatorImpl japaneseTranslator){

        this.englishTranslator = englishTranslator;
        this.japaneseTranslator = japaneseTranslator;
    }
    @Override
    public void speakChinese(String text) {
        System.out.println("自身会说中文:" + text);
    }

    @Override
    public void speakEnglish(String text) {
        englishTranslator.speak(text);
    }

    @Override
    public void speakJapanese(String text) {
        japaneseTranslator.speak(text);
    }
}
