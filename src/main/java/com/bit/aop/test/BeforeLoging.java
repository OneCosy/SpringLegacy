package com.bit.aop.test;

import org.springframework.aop.BeforeAdvice;

public class BeforeLoging implements BeforeAdvice {
    public void beforeMethod(String username) {
        System.out.println("메서드 호출 전 : " + username);
    }

}
