package com.latico.designpattern.structural.bridge.imagebridger;

import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;

/**
 * <PRE>
 *  抽象图像类：抽象类
 * </PRE>
 * @Author: LanDingDong
 * @Date: 2019-01-14 21:05:15
 * @Version: 1.0
 */
public abstract class AbstractImageBridger implements ImageBridger {
    /**
     * 保护级别，让子类能用到它
     */
    protected SystemImageDisplayer systemImageDisplayer;

    public AbstractImageBridger() {

    }
    public AbstractImageBridger(SystemImageDisplayer systemImageDisplayer) {
        this.systemImageDisplayer = systemImageDisplayer;
    }

  
    @Override
    public void setImageImp(SystemImageDisplayer systemImageDisplayer) {
        this.systemImageDisplayer = systemImageDisplayer;
    }

}