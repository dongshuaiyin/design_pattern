package com.dsy.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: dsy
 * @Description:
 * @Date: Create in 下午4:18 2020/11/23
 * @Modified by:
 */
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法执行之前的动作
        before();
        Object result = method.invoke(this.target, args);
        //方法执行后的动作
        after();
        return result;
    }


    private void after() {
        System.out.println("相亲已结束！！");
    }

    private void before() {
        System.out.println("相亲准备中");
    }
}
