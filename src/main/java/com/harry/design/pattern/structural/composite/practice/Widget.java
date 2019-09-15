package com.harry.design.pattern.structural.composite.practice;

import java.util.List;

/**
 * create by： harry
 * date:  2019/8/6 0006
 **/
public abstract class Widget extends Component {

    protected String name;

    @Override
    void add(Component component) {
        throw new RuntimeException("单个组件不支持添加子组件");
    }

    @Override
    void remove(Component component) {
        throw new RuntimeException("单个组件不删除添加子组件");
    }

    @Override
    List<Component> childList() {
        throw new RuntimeException("单个组件不存在子列表");
    }
}
