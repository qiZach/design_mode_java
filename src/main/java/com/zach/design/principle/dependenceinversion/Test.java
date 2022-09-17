package com.zach.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        // v1参数注入
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());

        // v2构造器注入
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();

        // v3属性注入
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();
        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
        geely.setiCourse(new PythonCourse());
        geely.studyImoocCourse();

    }
}
