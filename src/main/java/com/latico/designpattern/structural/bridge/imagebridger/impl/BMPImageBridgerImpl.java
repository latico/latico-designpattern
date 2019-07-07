package com.latico.designpattern.structural.bridge.imagebridger.impl;

import com.latico.designpattern.structural.bridge.imagebridger.AbstractImageBridger;
import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;

/**
 * <PRE>
 *  //BMP格式图像：扩充抽象类  
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 21:09:29
 * @Version: 1.0
 */
public class BMPImageBridgerImpl extends AbstractImageBridger {

    public BMPImageBridgerImpl() {
    }
    public BMPImageBridgerImpl(SystemImageDisplayer systemImageDisplayer) {
        super(systemImageDisplayer);
    }
    @Override
    public void doPaintImageByFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        byte[] datas = null;
        systemImageDisplayer.doPaint(datas);
        System.out.println(fileName + "，格式为BMP。");
    }
}