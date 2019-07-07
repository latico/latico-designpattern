package com.latico.designpattern.structural.bridge.imagebridger;

import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-19 0:07
 * @Version: 1.0
 */
public interface ImageBridger {

    void setImageImp(SystemImageDisplayer systemImageDisplayer);

    /**
     * 绘制图片文件
     * @param fileName
     */
    void doPaintImageByFile(String fileName);
}
