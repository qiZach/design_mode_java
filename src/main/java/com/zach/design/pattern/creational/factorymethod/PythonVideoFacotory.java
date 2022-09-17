package com.zach.design.pattern.creational.factorymethod;

public class PythonVideoFacotory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
