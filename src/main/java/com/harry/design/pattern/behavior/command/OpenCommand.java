package com.harry.design.pattern.behavior.command;

/**
 * create by： harry
 * date:  2019/8/13 0013
 **/
public class OpenCommand extends Command {

    private BoardScreen boardScreen = new BoardScreen();

    @Override
    void execute() {
        boardScreen.open();
    }
}
