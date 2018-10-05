package com.geely.design.pattern.creational.abstractfactory;

/**
 * Created by Administrator on 2018/10/5.
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getAriticle() {
        return new JavaArticle();
    }
}
