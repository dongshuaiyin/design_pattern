package com.dsy.pattern.singleton.register;

/**
 * 枚举式单例 -- 首先第一点可以不用被反射破坏 construtor 底层源码实现的不允许这样使用
 */
public enum EnumSingleton {

    instance;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        System.out.println(EnumSingleton.instance.getData());
        System.out.println("这里执行了枚举实例");
        return instance;
    }
}
