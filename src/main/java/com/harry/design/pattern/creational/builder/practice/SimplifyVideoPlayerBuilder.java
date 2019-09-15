package com.harry.design.pattern.creational.builder.practice;

/**
 * create by： harry
 * date:  2019/7/30 0030
 **/
public class SimplifyVideoPlayerBuilder extends VideoPlayerBuilder {
    @Override
    public void buildWindow() {
        videoPlayer.setWindow("精简模式下主窗口");
    }

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("精简模式下菜单");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("精简模式下播放列表");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("精简模式下控制条");
    }

    @Override
    public void buildStarList() {
        videoPlayer.setStarList("精简模式下搜藏列表");
    }

    @Override
    protected boolean isSimplify() {
        return true;
    }
}
