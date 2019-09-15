package com.harry.design.principle.singleresponsibility;

/**
 *  将原本杂合在一个接口中的方法拆分到两个接口中，便于在功能/业务上进行隔离
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
public class CourseImpl implements ICourseContent, ICourseManagement {
    @Override
    public void getCourseName() {

    }

    @Override
    public Byte[] getCourseVideo() {
        return new Byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void deleteCourse() {

    }
}
