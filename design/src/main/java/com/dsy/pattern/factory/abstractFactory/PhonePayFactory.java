package com.dsy.pattern.factory.abstractFactory;

public class PhonePayFactory implements IForeignCountry {
    @Override
    public IPay create() {
        return new PhonePay();
    }
}
