package com.zach.design.pattern.creational.abstractfactory;

public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
