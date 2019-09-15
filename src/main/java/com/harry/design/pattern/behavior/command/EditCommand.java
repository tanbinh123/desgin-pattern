package com.harry.design.pattern.behavior.command;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
public class EditCommand extends Command {

    private BoardScreen boardScreen = new BoardScreen();

    @Override
    void execute() {
        boardScreen.edit();
    }
}
