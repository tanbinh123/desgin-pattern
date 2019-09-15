package com.harry.design.pattern.creational.builder.practice;

/**
 * create by： harry
 * date:  2019/7/30 0030
 **/
public class CompleteVideoPlayerBuilder extends VideoPlayerBuilder{
    @Override
    public void buildWindow() {
        videoPlayer.setWindow("完整模式下的主窗口");
    }

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("完整模式下的菜单");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("完整模式下的播放列表");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("完整模式下的控制条");
    }

    @Override
    public void buildStarList() {
        videoPlayer.setStarList("完整模式下的搜藏列表");
    }
}
