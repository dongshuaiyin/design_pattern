package com.dsy.pattern.factory.factoryMethod;

public class JavaCourseFactory implements IcourseFactory {
    @Override
    public Icourse create() {
        return new JavaCourse();
    }
}
