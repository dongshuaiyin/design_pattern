package com.dsy.pattern.decorator;

/**
 * @Author: dsy
 * @Description:
 * @Date: Create in 下午2:20 2020/12/14
 * @Modified by:
 */
public class SauageDecorator extends BaseBatterCakeDecorator {

    public SauageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
