package com.geely.design.pattern.creational.simplefactory;

/**
 * Created by Administrator on 2018/10/5.
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
