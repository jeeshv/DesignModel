package com.geely.design.pattern.creational.factorymethod;

/**
 * Created by Administrator on 2018/10/5.
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
