package com.zach.design.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Zachary在学习Java课程");
    }
}
