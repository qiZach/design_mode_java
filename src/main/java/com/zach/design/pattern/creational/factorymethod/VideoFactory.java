package com.zach.design.pattern.creational.factorymethod;

/**
 * 产品工厂抽象类
 */
public abstract class VideoFactory {

    // 工厂方法
    public abstract Video getVideo();

//    public Video getVideo(Class c) {
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return video;
//    }
    // 每次添加都需要修改判断
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }
}
