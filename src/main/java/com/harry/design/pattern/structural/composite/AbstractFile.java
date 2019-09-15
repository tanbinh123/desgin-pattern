package com.harry.design.pattern.structural.composite;

/**
 *  叶子与容器抽象成共同的组件类
 * create by： harry
 * date:  2019/8/4 0004
 **/
public abstract class AbstractFile {

    public void add(AbstractFile file){
        throw new RuntimeException("不支持的操作类型");
    };

    public void remove(AbstractFile file){
        throw new RuntimeException("不支持的操作类型");
    }

    public AbstractFile getFile(int index){
        throw new RuntimeException("不支持的操作类型");
    }

    public abstract void killVirus();
}
