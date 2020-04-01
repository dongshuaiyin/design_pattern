package com.dsy.pattern.factory.abstractFactory;

public class WxPay implements IPay {
    @Override
    public void pay() {
        System.out.println("微信支付！！");
    }
}
