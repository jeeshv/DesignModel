package com.geely.design.principle.dependenceinversion;

/**
 * Created by Administrator on 2018/9/29.
 */
public class FECourse implements ICourse {
    @Override
    public void stydyCourse() {
        System.out.println("学习PE课程");
    }
}
