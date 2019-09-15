package com.harry.design.pattern.structural.composite.practice;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
public class Button extends Widget {

    @Override
    void show() {
        System.out.println("正在显示按钮:" + name);
    }

    public Button(String name){
        this.name = name;
    }
}
