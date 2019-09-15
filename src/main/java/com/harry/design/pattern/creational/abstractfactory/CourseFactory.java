package com.harry.design.pattern.creational.abstractfactory;

/**
 *  课程抽象工厂， 提供 视频，文章两个产品
 * create by： harry
 * date:  2019/7/18 0018
 **/
public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
