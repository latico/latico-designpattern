package com.latico.designpattern.structural.adapter.speakskill;

/**
 * <PRE>
 *  说话能力
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 20:20:02
 * @Version: 1.0
 */
public interface SpeakSkill {

    void speakChinese(String text);
    
    void speakEnglish(String text);

    void speakJapanese(String text);
}
