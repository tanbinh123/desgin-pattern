package com.harry.design.pattern.structural.bridge.practice;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public abstract class DataBaseFileConvertor {

    @Setter
    protected DataBaseFileConvertorImpl dataBaseFileConvertorImpl;

    abstract void convertToFile();
}
