package com.dsy.pattern.singleton.hungry;

public class Hungry {

    private static Hungry instance;

    /**
     *  静态代码块默认实例的化的时候被加载
     */
    static {
        instance = new Hungry();
    }

    private Hungry(){};

    public static Hungry getInstance() {
        return instance;
    }
}
