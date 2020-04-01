package com.dsy.pattern.singleton.hungry;

/**
 *  简单饿汗单例模式
 *
 *  优点： 简单、效率快
 *  缺点： 某种情况下，影响性能
 */
public class SimpleHungry {

    private static SimpleHungry instance = new SimpleHungry();

    private SimpleHungry(){};

    public static SimpleHungry getInstance() {
        return instance;
    }

    /**
     *  增加此方法可以防止被序列化破坏
     * @return
     */
    private Object readResolve() {
        return instance;
    }
}
