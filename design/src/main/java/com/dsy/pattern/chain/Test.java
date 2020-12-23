package com.dsy.pattern.chain;

import com.dsy.pattern.chain.optimiaze.MemberService;

/**
 * @Desc：
 * @Author：dongshuaiyin
 * @Date：2020/12/17 21:47
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.Login("dsy", null);
    }
}
