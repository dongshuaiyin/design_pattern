package com.dsy.pattern.chain;

/**
 * @Desc： 测试登录对象
 * @Author：dongshuaiyin
 * @Date：2020/12/17 22:48
 * @Version 1.0
 */
public class Member {

    private String username;

    private String password;

    private String roleName;

    public Member() {
    }

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
