package com.latico.designpattern.structural.bridge;

import com.latico.designpattern.structural.bridge.imagebridger.ImageBridger;
import com.latico.designpattern.structural.bridge.imagebridger.impl.BMPImageBridgerImpl;
import com.latico.designpattern.structural.bridge.imagebridger.impl.JPGImageBridgerImpl;
import com.latico.designpattern.structural.bridge.imagedisplayer.SystemImageDisplayer;
import com.latico.designpattern.structural.bridge.imagedisplayer.impl.LinuxSystemImageDisplayerImpl;
import com.latico.designpattern.structural.bridge.imagedisplayer.impl.UnixSystemImageDisplayerImpl;
import com.latico.designpattern.structural.bridge.imagedisplayer.impl.WindowsImageDisplayerImpl;

/**
 * <PRE>
 * 场景：图片的显示在不同操作系统显示实现是不一样，所以把操作系统的显示功能传进来给图片对象进行调用，
 * 把操作系统和图片桥接
 *
 * 适配器模式是会传入多个辅助对象，而桥接只会传入一个，同时桥接模式会使用抽象类进行一些模板后处理，
 * 而适配器模式一般是直接调用，让辅助对象帮忙执行。
 *
 * 基本跟适配器模式相似，区别在于，存在众多差异子类，需要抽象出方法让子类进行实现。
 * </PRE>
 *
 * @Author: latico
 * @Date: 2019-01-14 21:21
 * @Version: 1.0
 */
public class Test {
    public static void main(String args[]) {
        SystemImageDisplayer windowsImageDisplayerImpl = new WindowsImageDisplayerImpl();
        SystemImageDisplayer linuxSystemImageDisplayerImpl = new LinuxSystemImageDisplayerImpl();
        SystemImageDisplayer unixSystemImageDisplayerImpl = new UnixSystemImageDisplayerImpl();

        ImageBridger image = new BMPImageBridgerImpl(windowsImageDisplayerImpl);
        image.doPaintImageByFile("小龙女.bmp");

        image.setImageImp(linuxSystemImageDisplayerImpl);
        image.doPaintImageByFile("杨过.bmp");

        image = new JPGImageBridgerImpl(unixSystemImageDisplayerImpl);
        image.doPaintImageByFile("令狐冲.jpg");
    }
}
