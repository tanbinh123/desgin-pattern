package com.harry.design.pattern.behavior.command;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
@AllArgsConstructor
public class MenuItem {

    private String name;

    private Command command;

    public void click(){
        System.out.println(String.format("菜单项:%s被点击;", name));
        command.execute();
    }
}
