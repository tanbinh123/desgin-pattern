package com.harry.design.pattern.creational.prototype.prototypemanager;

/**
 *  抽象文档原型
 * create by： harry
 * date:  2019/7/29 0029
 **/
public abstract class OfficialDocument implements Cloneable{

    protected OfficialDocument clone(){
        OfficialDocument officialDocument = null;
        try {
            officialDocument = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆不支持!");
            e.printStackTrace();
            return null;
        }
        return officialDocument;
    };

    public abstract void display();
}
