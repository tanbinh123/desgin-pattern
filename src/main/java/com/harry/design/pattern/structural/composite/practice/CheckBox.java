package com.harry.design.pattern.structural.composite.practice;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
public class CheckBox extends Widget {

    @Override
    void show() {
        System.out.println("正在显示复选框:" + name);
    }

    public CheckBox(String name){
        this.name = name;
    }
}
