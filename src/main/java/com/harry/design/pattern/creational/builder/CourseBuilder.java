package com.harry.design.pattern.creational.builder;

/**
 * create by： harry
 * date:  2019/7/23 0023
 **/
public abstract class CourseBuilder {

    public abstract void buildVideo(String video);

    public abstract void buildPPT(String ppt);

    public abstract void buildArticle(String article);

    public abstract void buildQA(String qa);

    public abstract void buildName(String name);

    public abstract Course makeCourse();
}
