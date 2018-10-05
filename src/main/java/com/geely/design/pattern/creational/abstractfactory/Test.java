package com.geely.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂
 * 定义：抽象工厂模式提供一个创建[ 一系列 ] 相关或相互依赖对象的接口（产品族，产品等级概念）
 * 适用场景：强调一系列相关的产品对象（属于同一产品族）
 *      一起使用创建对象需要大量重复的代码。
 * 优点：具体产品在应用层代码隔离，无须关心创建细节，将一个系列的产品族统一到一起创建
 * Created by Administrator on 2018/10/5.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video javaVideo = courseFactory.getVideo();
        Article javaAriticle = courseFactory.getAriticle();
        javaVideo.produce();
        javaAriticle.produce();
    }
}
