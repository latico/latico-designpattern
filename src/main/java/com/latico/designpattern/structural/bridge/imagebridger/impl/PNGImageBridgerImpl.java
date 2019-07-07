package com.latico.designpattern.structural.bridge.imagebridger.impl;

import com.latico.designpattern.structural.bridge.imagebridger.AbstractImageBridger;
import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;

/**
 * <PRE>
 *  //PNG格式图像：扩充抽象类  
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 21:09:22
 * @Version: 1.0
 */
public class PNGImageBridgerImpl extends AbstractImageBridger {
    public PNGImageBridgerImpl() {
    }
    public PNGImageBridgerImpl(SystemImageDisplayer systemImageDisplayer) {
        super(systemImageDisplayer);
    }
    @Override
    public void doPaintImageByFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        byte[] datas = null;
        systemImageDisplayer.doPaint(datas);
        System.out.println(fileName + "，格式为PNG。");
    }
}