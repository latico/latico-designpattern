package com.latico.designpattern.structural.bridge.imagedisplayer.impl;


import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;

/**
 * <PRE>
 *  //Unix操作系统实现类：具体实现类
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 21:08:32
 * @Version: 1.0
 */
public class UnixSystemImageDisplayerImpl implements SystemImageDisplayer {
    @Override
    public void doPaint(byte[] datas) {
        //调用Unix系统的绘制函数绘制像素矩阵  
        System.out.print("在Unix操作系统中显示图像：");  
    }  
} 