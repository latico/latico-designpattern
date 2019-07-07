package com.latico.designpattern.structural.bridge.imagedisplayer;


/**
 * <PRE>
 *  //抽象操作系统实现类：实现类接口
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 21:04:23
 * @Version: 1.0
 */
public interface SystemImageDisplayer {

    /**
     * 显示像素矩阵
     * @param m
     */
    public void doPaint(byte[] datas);
} 