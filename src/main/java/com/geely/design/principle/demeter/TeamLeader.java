package com.geely.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/3.
 */
public class TeamLeader {
    public void checkNumberOfCourses(){
        //v1
        //System.out.println("在线课程的数量是：" + courseList.size());

        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
