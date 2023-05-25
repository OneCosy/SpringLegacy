package com.bit.aop.test;

import org.springframework.aop.AfterAdvice;

public class AfterLoging implements AfterAdvice {
    public void afterMethod(String username) {
        System.out.println("메서드 호출 후 : " + username);
    }
}
