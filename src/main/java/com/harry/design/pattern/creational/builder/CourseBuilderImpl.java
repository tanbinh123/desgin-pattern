package com.harry.design.pattern.creational.builder;

/**
 * create by： harry
 * date:  2019/7/23 0023
 **/
public class CourseBuilderImpl extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void buildPPT(String ppt) {
        course.setPpt(ppt);
    }

    @Override
    public void buildArticle(String article) {
        course.setArticle(article);
    }

    @Override
    public void buildQA(String qa) {
        course.setQa(qa);
    }

    @Override
    public void buildName(String name) {
        course.setName(name);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
