package com.dsy.pattern.proxy.dynamic.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Author: dsy
 * @Description:
 * @Date: Create in 下午4:31 2020/11/23
 * @Modified by:
 */
public class Test {
    public static void main(String[] args) {
        JDKMeipo jdkMeipo = new JDKMeipo();
        IPerson zhangsan = (IPerson) jdkMeipo.getInstance(new ZhangSan());
        zhangsan.findLove(8);
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});

        try(FileOutputStream fos =
                    new FileOutputStream("//Users//dongshuaiyin//Downloads//$Proxy0.class")) {
            fos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
