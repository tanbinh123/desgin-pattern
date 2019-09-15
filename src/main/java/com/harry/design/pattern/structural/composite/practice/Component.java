package com.harry.design.pattern.structural.composite.practice;

import java.util.List;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
public abstract class Component {

    abstract void show();

    abstract void add(Component component);

    abstract void remove(Component component);

    abstract List<Component> childList();
}
