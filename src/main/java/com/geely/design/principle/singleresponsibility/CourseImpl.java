package com.geely.design.principle.singleresponsibility;

/**
 * Created by Administrator on 2018/10/2.
 */
public class CourseImpl implements ICourseContent,ICourseManager {
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
