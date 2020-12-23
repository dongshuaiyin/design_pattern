package com.dsy.pattern.chain.optimiaze;

import com.dsy.pattern.chain.Member;

/**
 * @Desc：
 * @Author：dongshuaiyin
 * @Date：2020/12/17 22:52
 * @Version 1.0
 */
public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if ("".equals(member.getUsername()) || null == member.getUsername()) {
            System.out.println("用户名为空");
            return;
        }
        if ("".equals(member.getPassword()) || null == member.getPassword()) {
            System.out.println("密码为空");
            return;
        }
        System.out.println("用户名或者密码验证通过");
        next.doHandler(member);
    }
}
