package com.geely.design.principle.dependenceinversion;

/**
 * Created by Administrator on 2018/9/29.
 */
public class Geely {
    private ICourse iCourse;
   /* public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    public void stydyImmocCourse(){
        iCourse.stydyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
