package com.harry.design.principle.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
@Slf4j
public class TeamLeader {

    public void countCourseNumber(){
        List<Course> courseList = new ArrayList<>(16);
        for(int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        log.info("总课程数:{}", courseList.size());
    }
}
