package com.dsy.pattern.chain.optimiaze;

import com.dsy.pattern.chain.Member;

/**
 * @Desc：
 * @Author：dongshuaiyin
 * @Date：2020/12/17 22:57
 * @Version 1.0
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (null == member.getPassword()) {
            System.out.println("登录失败！ 密码不正确");
            return;
        }
        System.out.println("登录成功");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
