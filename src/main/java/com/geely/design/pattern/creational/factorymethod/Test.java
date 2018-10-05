package com.geely.design.pattern.creational.factorymethod;

/**
 * 简单工厂模式（并不属于23种设计模式）
 * Created by Administrator on 2018/10/5.
 */
public class Test {
    public static void main(String[] args) {
       VideoFactory videoFactory = new JavaVideoFactory();
       VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
