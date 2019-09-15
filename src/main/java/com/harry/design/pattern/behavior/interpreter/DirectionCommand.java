package com.harry.design.pattern.behavior.interpreter;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
@AllArgsConstructor
public class DirectionCommand extends Command {

    private String direction;

    @Override
    public String interpret() {
        if("up".equalsIgnoreCase(direction)){
            return "向上";
        }
        if("down".equalsIgnoreCase(direction)){
            return "向下";
        }
        if("left".equalsIgnoreCase(direction)){
            return "向左";
        }
        if("right".equalsIgnoreCase(direction)){
            return "向右";
        }
        return "无效指令";
    }
}
