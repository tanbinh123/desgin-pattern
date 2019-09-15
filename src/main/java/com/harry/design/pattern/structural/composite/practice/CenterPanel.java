package com.harry.design.pattern.structural.composite.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
public class CenterPanel extends Container {

    @Override
    void show() {
        System.out.println("正在展示中央面板:" + name);
        for (Component component : super.childList()) {
            component.show();
        }
    }

    public CenterPanel(String name){
        this.name = name;
    }
}
