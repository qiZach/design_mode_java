package com.zach.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().
                buildCourseName("Java设计模式").
                buildcoursePPTName("Java设计模式PPT").
                buildcourseVideoName("Java设计模式视频").
                buildcourseArticleName("Java设计模式手记").
                buildcourseQAName("Java设计模式问答").
                build();
        System.out.println(course);
    }
}
