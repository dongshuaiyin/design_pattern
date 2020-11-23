package com.dsy.pattern.proxy.dynamic.jdk;

/**
 * @Author: dsy
 * @Description:
 * @Date: Create in 下午4:17 2020/11/23
 * @Modified by:
 */
public class ZhangSan implements IPerson {
    @Override
    public void findLove(Integer count) {
        System.out.println("张三需求：肤白貌美大长腿，" + "需要的数量：" +count);
    }
}
