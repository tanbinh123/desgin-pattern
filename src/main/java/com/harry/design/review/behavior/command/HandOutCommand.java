package com.harry.design.review.behavior.command;

/**
 * create by： harry
 * date:  2019/8/25 0025 下午 4:27
 **/
public class HandOutCommand implements Command {

    private Player player;

    public HandOutCommand(Player player) {
        this.player = player;
    }

    @Override
    public void executeCommand() {
        this.player.attackAction();
    }
}
