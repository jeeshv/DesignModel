package com.geely.design.principle.dependenceinversion;

/**
 * Created by Administrator on 2018/9/29.
 */
public class JavaCourse implements ICourse {
    @Override
    public void stydyCourse() {
        System.out.println("学习JAVA课程");
    }
}
