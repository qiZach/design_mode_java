package com.zach.design.pattern.creational.builder;

public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildcoursePPTName(String coursePPT);

    public abstract void buildcourseVideoName(String courseVideo);

    public abstract void buildcourseArticleName(String courseArticle);

    public abstract void buildcourseQAName(String courseQA);

    public abstract Course makeCourse();
}
