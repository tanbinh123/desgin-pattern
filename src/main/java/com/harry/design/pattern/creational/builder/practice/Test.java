package com.harry.design.pattern.creational.builder.practice;

/**
 *  Sunny软件公司欲开发一个视频播放软件，为了给用户使用提供方便，
 *  该播放软件提供多种界面显示模式，如完整模式、精简模式、记忆模式、网络模式等。
 *  在不同的显示模式下主界面的组成元素有所差异，如在完整模式下将显示菜单、播放列表、主窗口、控制条等，
 *  在精简模式下只显示主窗口和控制条，而在记忆模式下将显示主窗口、控制条、收藏列表等。尝试使用建造者模式设计该软件。
 * create by： harry
 * date:  2019/7/30 0030
 **/
public class Test {

    public static void main(String[] args) {
        VideoPlayerBuilder completeVideoPlayerBuilder = new CompleteVideoPlayerBuilder();
        VideoPlayer videoPlayer = completeVideoPlayerBuilder.construct();
        System.out.println(videoPlayer);

        VideoPlayerBuilder simplifyVideoPlayerBuilder = new SimplifyVideoPlayerBuilder();
        videoPlayer = simplifyVideoPlayerBuilder.construct();
        System.out.println(videoPlayer);

        VideoPlayerBuilder rememberVideoPlayerBuilder = new RememberVideoPlayerBuilder();
        videoPlayer = rememberVideoPlayerBuilder.construct();
        System.out.println(videoPlayer);
    }
}
