package com.zach.design.principle.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Zachary在学习Python课程");
    }
}
