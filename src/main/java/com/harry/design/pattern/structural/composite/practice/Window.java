package com.harry.design.pattern.structural.composite.practice;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
@AllArgsConstructor
public class Window  extends Container{

    @Override
    void show() {
        System.out.println("正在展示窗口:" + name);
        for (Component component : super.childList()) {
            component.show();
        }
    }

    public Window(String name){
        this.name = name;
    }

}
