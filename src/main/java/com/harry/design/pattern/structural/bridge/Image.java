package com.harry.design.pattern.structural.bridge;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/7/31 0031
 **/
public abstract class Image {

    @Setter
    protected ImageOperateSystemImpl imageOperateSystemImpl;

    abstract void showImage(String fileName);
}
