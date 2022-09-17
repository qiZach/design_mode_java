package com.zach.design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo(JavaVideo.class);
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();


    }
}
