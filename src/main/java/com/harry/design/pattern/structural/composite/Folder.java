package com.harry.design.pattern.structural.composite;

import lombok.Setter;

import java.util.ArrayList;

/**
 * create by： harry
 * date:  2019/8/4 0004
 **/
public class Folder extends AbstractFile {

    /** 集合用于存储Abstract类型的文件 **/
    private ArrayList<AbstractFile> list = new ArrayList<>(16);

    @Setter
    private String name;

    @Override
    public void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        list.remove(file);
    }

    @Override
    public AbstractFile getFile(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹:" + name + "进行杀毒");  //模拟杀毒
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
