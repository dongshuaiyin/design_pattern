package com.dsy.pattern.factory.abstractFactory;

public abstract class PayAbstractFactory {

    public void init() {
        System.out.println("初始化细节的一些操作");
    }

    /**
     *  国外
     * @return
     */
    protected abstract IForeignCountry createForeign();

    /**
     * 国内
     * @return
     */
    protected abstract ISelfCountry createSelf();


}
