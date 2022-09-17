package com.zach.design.pattern.creational.factorymethod;

/**
 * 继承自某一产品
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
