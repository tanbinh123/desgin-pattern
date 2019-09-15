package com.harry.design.pattern.creational.simplefactory;

/**
 *  视频工程
 * create by： 徐齐斌
 * date:  2019/7/16 0016
 **/
public class VideoFactory {

   /* public static Video getVideo(String videoType){
        if("java".equalsIgnoreCase(videoType)){
            return new JavaVideo();
        }
        if("phython".equalsIgnoreCase(videoType)){
            return new PhythonVideo();
        }
        return null;
    }*/

    /**
     * 通过反射来创建对应的产品
     * @param clazz 类
     * @return 对象实例
     */
   public static Video getVideo(Class clazz){
       Video video = null;
       try {
           video = (Video) Class.forName(clazz.getName()).newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return video;
   }
}
