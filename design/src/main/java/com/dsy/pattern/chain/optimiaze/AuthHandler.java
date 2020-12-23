package com.dsy.pattern.chain.optimiaze;

import com.dsy.pattern.chain.Member;

/**
 * @Desc：
 * @Author：dongshuaiyin
 * @Date：2020/12/17 23:01
 * @Version 1.0
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("暂无相关权限");
            return;
        }
        System.out.println("允许操作");
    }
}
