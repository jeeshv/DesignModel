package com.geely.design.pattern.creational.abstractfactory;

/**
 * Created by Administrator on 2018/10/5.
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
