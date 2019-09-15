package com.harry.design.pattern.creational.builder.v2;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * create by： harry
 * date:  2019/7/23 0023
 **/
@Data
@ToString
public class Course {

    private String name;

    private String video;

    private String ppt;

    private String qa;

    private String article;

    public Course(CourseBuilder courseBuilder){
        this.name = courseBuilder.name;
        this.video = courseBuilder.video;
        this.ppt = courseBuilder.ppt;
        this.qa = courseBuilder.qa;
        this.article = courseBuilder.article;
    }

    public static class CourseBuilder{
        private String name;

        private String video;

        private String ppt;

        private String qa;

        private String article;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return  this;
        }

        public CourseBuilder buildVideo(String video) {
            this.video = video;
            return  this;
        }

        public CourseBuilder buildPpt(String ppt) {
            this.ppt = ppt;
            return  this;
        }

        public CourseBuilder buildQa(String qa) {
            this.qa = qa;
            return  this;
        }

        public CourseBuilder buildArticle(String article) {
            this.article = article;
            return  this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
