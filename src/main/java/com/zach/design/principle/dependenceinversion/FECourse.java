package com.zach.design.principle.dependenceinversion;

public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Zachary在学习前端课程");
    }
}
