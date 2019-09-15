package com.harry.design.pattern.behavior.interpreter;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
@AllArgsConstructor
public class DistanceCommand extends Command {

    private String distance;

    @Override
    String interpret() {
        return this.distance;
    }
}
