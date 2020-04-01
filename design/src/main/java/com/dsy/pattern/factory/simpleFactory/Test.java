package com.dsy.pattern.factory.simpleFactory;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Icourse course = new CourseFactory().create(PythonCourse.class);
        course.record();
        Calendar.getInstance();
    }
}
