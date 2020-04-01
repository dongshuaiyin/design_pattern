package com.dsy.pattern.factory.factoryMethod;

public interface IcourseFactory {

    /**
     *  在这里我只负责创建方法，具体的创建细节我并不关心
     * @return
     */
    Icourse create();
}
