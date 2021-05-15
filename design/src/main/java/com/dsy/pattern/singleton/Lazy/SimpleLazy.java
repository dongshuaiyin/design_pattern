package com.dsy.pattern.singleton.Lazy;

/**
 *  这里是升级过后的懒汉单例模式
 *  优点：线程安全~
 *  缺点：
 */
public class SimpleLazy {

    private static SimpleLazy instance;

    private SimpleLazy(){};

    public static SimpleLazy getInstance() {
        if (instance == null) {
            synchronized (SimpleLazy.class) {
                if (instance == null) {
                    instance = new SimpleLazy();
                }
            }
        }
        return instance;
    }
}
