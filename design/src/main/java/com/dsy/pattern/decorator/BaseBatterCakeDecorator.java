package com.dsy.pattern.decorator;

/**
 * @Author: dsy
 * @Description: 煎饼果子示例
 * @Date: Create in 上午10:12 2020/12/14
 * @Modified by:
 */
public class BaseBatterCakeDecorator extends BaseBatterCake {


    BatterCake batterCake;

    public BaseBatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected String getMsg() {
        return batterCake.getMsg();
    }

    protected int getPrice() {
        return batterCake.getPrice();
    }
}
