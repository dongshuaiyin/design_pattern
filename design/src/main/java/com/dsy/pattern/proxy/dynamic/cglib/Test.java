package com.dsy.pattern.proxy.dynamic.cglib;

/**
 * @Author: dsy
 * @Description:
 * @Date: Create in 下午4:54 2020/11/23
 * @Modified by:
 */
public class Test {

    public static void main(String[] args) {
        ZhangSan zhangSan = (ZhangSan) new CglibMeipo().getInstance(ZhangSan.class);
        zhangSan.findLove(6);
    }
}
