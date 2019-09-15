package com.harry.design.pattern.behavior.interpreter;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
@AllArgsConstructor
public class ActionCommand extends Command {

    private String action;

    @Override
    public String interpret() {
        if("move".equalsIgnoreCase(action)){
            return "移动";
        }
        if("run".equalsIgnoreCase(action)){
            return "奔跑";
        }
        return "无效指令";
    }
}
