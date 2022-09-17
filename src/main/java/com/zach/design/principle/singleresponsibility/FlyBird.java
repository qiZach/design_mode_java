package com.zach.design.principle.singleresponsibility;

public class FlyBird implements Bird {
    @Override
    public void mainMoveMode(String birdName) {
        System.out.println(birdName + "用翅膀飞");
    }
}
