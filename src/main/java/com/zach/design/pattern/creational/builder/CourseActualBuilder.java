package com.zach.design.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildcoursePPTName(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildcourseVideoName(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildcourseArticleName(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildcourseQAName(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
