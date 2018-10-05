package com.geely.design.pattern.creational.simplefactory;

/**
 * 简单工厂模式（并不属于23种设计模式）
 * Created by Administrator on 2018/10/5.
 */
public class Test {
    public static void main(String[] args) {
        //应用层，客户端代码
        //v1
       /* Video video = new JavaVideo();
        video.produce();*/

       //v2
        /*VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("python");
        video.produce();*/

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }
}
