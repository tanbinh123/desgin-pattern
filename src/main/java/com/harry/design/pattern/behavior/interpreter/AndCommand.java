package com.harry.design.pattern.behavior.interpreter;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
@AllArgsConstructor
public class AndCommand extends Command {

    private Command left;

    private Command right;

    @Override
    String interpret() {
        return left.interpret() + " -然后- "+ right.interpret();
    }
}
