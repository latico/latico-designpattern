package com.latico.designpattern.structural.bridge.imagedisplayer.impl;


import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;

/**
 * <PRE>
 *  //Linux操作系统实现类：具体实现类
 * </PRE>
 * @Author: LanDingDong
 * @Date: 2019-01-14 21:07:57
 * @Version: 1.0
 */
public class LinuxSystemImageDisplayerImpl implements SystemImageDisplayer {
    @Override
    public void doPaint(byte[] datas) {
        //调用Linux系统的绘制函数绘制像素矩阵  
        System.out.print("在Linux操作系统中显示图像：");  
    }  
} 