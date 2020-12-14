package com.dsy.pattern.decorator;

/**
 * @Author: dsy
 * @Description: 鸡蛋装饰器
 * @Date: Create in 下午2:19 2020/12/14
 * @Modified by:
 */
public class EggDecorator extends BaseBatterCakeDecorator {

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
