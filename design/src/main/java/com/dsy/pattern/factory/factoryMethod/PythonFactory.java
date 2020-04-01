package com.dsy.pattern.factory.factoryMethod;

public class PythonFactory implements IcourseFactory {
    @Override
    public Icourse create() {
        return new PythonCourse();
    }
}
