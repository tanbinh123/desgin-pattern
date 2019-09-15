package com.harry.design.pattern.behavior.interpreter;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
@AllArgsConstructor
public class SentenceCommand extends Command {

    private Command action;

    private Command direction;

    private Command distance;

    @Override
    String interpret() {
        return action.interpret() + direction.interpret() + distance .interpret();
    }
}
