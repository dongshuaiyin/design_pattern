package com.dsy.pattern.decorator;

/**
 * @Author: dsy
 * @Description:
 * @Date: Create in 下午2:21 2020/12/14
 * @Modified by:
 */
public class Test {

    public static void main(String[] args) {

        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);

        System.out.println(batterCake.getMsg() + ", 总价：" + batterCake.getPrice());
    }
}
