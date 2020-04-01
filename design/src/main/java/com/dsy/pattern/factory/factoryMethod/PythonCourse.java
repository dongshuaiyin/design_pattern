package com.dsy.pattern.factory.factoryMethod;

public class PythonCourse implements Icourse {
    @Override
    public void record() {
        System.out.println("开始录播pythod课程！！");
    }
}
