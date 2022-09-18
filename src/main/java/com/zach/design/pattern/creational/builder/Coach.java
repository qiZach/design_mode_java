package com.zach.design.pattern.creational.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildcoursePPTName(coursePPT);
        this.courseBuilder.buildcourseArticleName(courseArticle);
        this.courseBuilder.buildcourseVideoName(courseVideo);
        this.courseBuilder.buildcourseQAName(courseQA);
        return this.courseBuilder.makeCourse();

    }
}
