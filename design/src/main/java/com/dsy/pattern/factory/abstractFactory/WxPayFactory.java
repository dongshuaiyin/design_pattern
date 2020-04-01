package com.dsy.pattern.factory.abstractFactory;

public class WxPayFactory implements ISelfCountry {
    @Override
    public IPay create() {
        return new WxPay();
    }
}
