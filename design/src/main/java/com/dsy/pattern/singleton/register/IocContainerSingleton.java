package com.dsy.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例的实现方式
 */
public class IocContainerSingleton {

    private IocContainerSingleton() {
    }

    private static Map<String, Object> container = new ConcurrentHashMap<>();

    /**
     *  将每一个实例添加到容器当中
     * @param className 类名
     * @return
     */
    public static Object getInstance(String className) {
        if (!container.containsKey(className)) {
            Object instance = null;
            try {
                Class clazz = Class.forName(className);
                instance = clazz.newInstance();
                container.put(className, instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        } else {
            return container.get(className);
        }
    }
}
