package com.dsy.pattern.factory.simpleFactory;

/**
 *  简单工厂模式- 工厂
 */
public class CourseFactory {

    public Icourse create(Class<? extends Icourse> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
