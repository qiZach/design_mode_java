package com.zach.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        // 类的单一原则
        Bird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        Bird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
