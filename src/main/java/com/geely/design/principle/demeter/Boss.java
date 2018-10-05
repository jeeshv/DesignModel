package com.geely.design.principle.demeter;
/**
 * Created by Administrator on 2018/10/3.
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        //v1
        /*List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);*/

        teamLeader.checkNumberOfCourses();
    }
}
