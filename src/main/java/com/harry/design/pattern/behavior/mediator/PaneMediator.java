package com.harry.design.pattern.behavior.mediator;

import lombok.Setter;

/**
 * create by： harry
 * date:  2019/8/18 0018
 **/
@Setter
public class PaneMediator extends Mediator {

    private ListPane listPane;

    private TextPane textPane;

    private GraphicPane graphicPane;

    @Override
    void handleBehavior() {

    }
}
