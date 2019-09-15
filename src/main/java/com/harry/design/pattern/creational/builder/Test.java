package com.harry.design.pattern.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * create by： harry
 * date:  2019/7/23 0023
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilderImpl();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式", "java设计模式ppt", "java设计模式视频",
                "java设计模式问答", "java设计模式手记");

        log.info(course.toString());
    }
}
