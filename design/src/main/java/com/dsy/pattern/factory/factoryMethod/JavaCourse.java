package com.dsy.pattern.factory.factoryMethod;

/**
 *  java 录播课程
 */
public class JavaCourse implements Icourse {

    @Override
    public void record() {
        System.out.println("开始录播java课程！！");
    }
}
