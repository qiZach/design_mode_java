package com.zach.design.principle.dependenceinversion;

public class Geely {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        this.iCourse.studyCourse();
    }
}
