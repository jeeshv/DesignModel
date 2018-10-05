package com.geely.design.pattern.creational.simplefactory;

/**
 * Created by Administrator on 2018/10/5.
 */
public class VideoFactory {
    //v2
   /* public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }else {
            return null;
        }
    }*/
   //v3用反射
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }
}
