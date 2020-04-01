package com.dsy.pattern.factory.abstractFactory;

public class PhonePay implements IPay {

    @Override
    public void pay() {
        System.out.println("苹果手机支付！！");
    }
}
