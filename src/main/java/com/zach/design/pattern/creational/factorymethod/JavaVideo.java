package com.zach.design.pattern.creational.factorymethod;

/**
 * 工厂实际产品
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
