package com.harry.design.pattern.creational.abstractfactory;

/**
 * create by： harry
 * date:  2019/7/18 0018
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
