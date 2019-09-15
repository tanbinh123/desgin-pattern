package com.harry.design.pattern.creational.builder;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/7/23 0023
 **/
public class Coach {
    @Setter
    private CourseBuilder courseBuilder;

    public Course makeCourse(String courseName, String coursePpt, String courseVideo, String courseQa, String courseArticle){
        courseBuilder.buildArticle(courseArticle);
        courseBuilder.buildQA(courseQa);
        courseBuilder.buildVideo(courseVideo);
        courseBuilder.buildPPT(coursePpt);
        courseBuilder.buildName(courseName);
        return  courseBuilder.makeCourse();
    }
}
