package com.harry.design.pattern.structural.composite;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/4 0004
 **/
public class ImageFile extends AbstractFile {

    @Setter
    private String name;

    @Override
    public void killVirus() {
        System.out.println("对图片文件:" + name + "进行杀毒");
    }
}
