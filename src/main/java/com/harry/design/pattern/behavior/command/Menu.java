package com.harry.design.pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
public class Menu {

    private List<MenuItem> menuItemList = new ArrayList<>(16);

    public void addMenuItem(MenuItem menuItem){
        menuItemList.add(menuItem);
    }

}
