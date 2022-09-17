package com.zach.design.pattern.creational.factorymethod;

/**
 * 具体实例的工厂继承自总工厂，并返回相应实例
 */

public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
