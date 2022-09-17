package com.zach.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从0到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() +
                " 课程价格: " + javaCourse.getOriginPrice() + " 课程折后价格: " + javaCourse.getPrice());
    }
}
