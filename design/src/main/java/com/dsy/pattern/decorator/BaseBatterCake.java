package com.dsy.pattern.decorator;

/**
 * @Author: dsy
 * @Description: 煎饼果子示例
 * @Date: Create in 上午10:12 2020/12/14
 * @Modified by:
 */
public class BaseBatterCake extends BatterCake {


    @Override
    protected String getMsg() {
        return "一个煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
