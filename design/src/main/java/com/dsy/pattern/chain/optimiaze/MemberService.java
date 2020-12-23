package com.dsy.pattern.chain.optimiaze;

import com.dsy.pattern.chain.Member;

/**
 * @Desc：
 * @Author：dongshuaiyin
 * @Date：2020/12/17 23:02
 * @Version 1.0
 */
public class MemberService {

    public void Login(String loginName, String loginPassword) {
        //第一个版本，仅仅使用责任链模式处理校验
        /*Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(new Member(loginName, loginPassword));*/


        //第二个版本，用建造者模式的方式添加责任链节点
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.buildHandler().doHandler(new Member(loginName, loginPassword));
    }
}
