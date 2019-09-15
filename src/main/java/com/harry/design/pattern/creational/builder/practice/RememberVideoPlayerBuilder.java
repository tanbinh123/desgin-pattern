package com.harry.design.pattern.creational.builder.practice;

/**
 * create by： harry
 * date:  2019/7/30 0030
 **/
public class RememberVideoPlayerBuilder extends VideoPlayerBuilder {
    @Override
    public void buildWindow() {
        videoPlayer.setWindow("记忆模式下主窗口");
    }

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("记忆模式下惨淡");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("记忆模式下播放列表");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("记忆模式下控制条");
    }

    @Override
    public void buildStarList() {
        videoPlayer.setStarList("记忆模式下搜藏列表");
    }

    @Override
    protected boolean isRemember() {
        return true;
    }
}
