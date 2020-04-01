package com.dsy.pattern.singleton.register;

import com.dsy.pattern.singleton.register.EnumSingleton;

public class Test {

    public static void main(String[] args) {
//        EnumSingleton.instance.setData("这是我存入的值");
//        EnumSingleton instance = EnumSingleton.getInstance();

        Object instance1 = IocContainerSingleton.getInstance("com.dsy.pattern.singleton.register.Pojo");
        Object instance2 = IocContainerSingleton.getInstance("com.dsy.pattern.singleton.register.Pojo");
        System.out.println(instance1 == instance2);
    }
}
