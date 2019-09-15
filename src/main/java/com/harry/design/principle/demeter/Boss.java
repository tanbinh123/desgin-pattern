package com.harry.design.principle.demeter;

/**
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
public class Boss {

    public void checkCourseNumber(TeamLeader teamLeader){
        teamLeader.countCourseNumber();
    }
}
