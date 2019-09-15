package com.harry.design.pattern.structural.composite.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
public abstract class Container extends Component {

    protected String name;

    private List<Component> childList = new ArrayList<>(16);


    @Override
    void add(Component component) {
        childList.add(component);
    }

    @Override
    void remove(Component component) {
        childList.remove(component);
    }

    @Override
    List<Component> childList() {
        return childList;
    }
}
