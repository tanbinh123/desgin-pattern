package com.harry.design.pattern.structural.flyweight;

import lombok.AllArgsConstructor;

/**
 * create by： harry
 * date:  2019/8/8 0008
 **/
@AllArgsConstructor
public class Video extends MediaResource {

    private String address;

    @Override
    String getMessage() {
        return "视频地址:" + address;
    }
}
