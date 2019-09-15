package com.harry.design.pattern.creational.abstractfactory;

/**
 * create by： harry
 * date:  2019/7/18 0018
 **/
public class PhythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PhythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PhythonArticle();
    }
}