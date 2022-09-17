package com.zach.design.principle.singleresponsibility;

public class WalkBird implements Bird {
    @Override
    public void mainMoveMode(String birdName) {
        System.out.println(birdName + "用脚走");
    }
}
