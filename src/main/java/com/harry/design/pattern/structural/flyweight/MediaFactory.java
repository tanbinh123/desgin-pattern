package com.harry.design.pattern.structural.flyweight;

import java.util.Hashtable;
import java.util.Objects;

/**
 * create by： harry
 * date:  2019/8/8 0008
 **/
public class MediaFactory {

    private Hashtable<String, MediaResource> mediaResourceHashTable = new Hashtable<>(32);

    private MediaFactory(){ }

    public static MediaFactory getMediaFactory(){
        return MediaFactoryHolder.mediaFactory;
    }

    /**
     * 获取媒体资源
     * @param address 媒体资源地址
     * @return 返回媒体资源
     */
    public MediaResource getMediaResource(String address){
        MediaResource mediaResource = mediaResourceHashTable.get(address);
        if(mediaResource == null){
            String type = address.split("[.]")[1];
            if(Objects.equals(type, "jpg")) {
                mediaResource = new Picture(address);
            }else if(Objects.equals(type, "gif")) {
                mediaResource = new GIF(address);
            }else if(Objects.equals(type, "avi")) {
                mediaResource = new Video(address);
            }
            mediaResourceHashTable.put(address, mediaResource);
        }
        return mediaResource;
    }

    private static class MediaFactoryHolder{
        private static MediaFactory mediaFactory = new MediaFactory();
    }

}
