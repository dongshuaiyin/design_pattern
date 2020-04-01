package com.dsy.pattern.factory.factoryMethod;

/**
 *  此种工厂模式符合单一原则
 */
public class Test {

    public static void main(String[] args) {

        IcourseFactory factory = new JavaCourseFactory();
        Icourse course = factory.create();
        course.record();

    }
}
