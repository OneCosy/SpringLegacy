package com.bit.aop.test;

public class UserServiceImp implements UserService {
    @Override
    public void login(String username) {
        System.out.println("로그인 : " + username);
    }

    @Override
    public void logout(String username) {
        System.out.println("로그아웃 : " + username);
    }
}
