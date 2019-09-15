package com.harry.design.pattern.creational.builder.practice;

/**
 * create by： harry
 * date:  2019/7/30 0030
 **/
public abstract class VideoPlayerBuilder {

    protected VideoPlayer videoPlayer = new VideoPlayer();

    public abstract void buildWindow();

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildControlBar();

    public abstract void buildStarList();

    protected boolean isSimplify(){
        return false;
    }

    protected boolean isRemember(){
        return false;
    }

    public VideoPlayer construct(){
        this.buildWindow();
        this.buildControlBar();
        if(!this.isSimplify()){
            this.buildStarList();
            if(!this.isRemember()){
                this.buildMenu();
                this.buildPlayList();
            }
        }
        return videoPlayer;
    }
}
