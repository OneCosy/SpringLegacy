package com.bit.aop.basic1;

public class BeforeAdvice implements org.springframework.aop.BeforeAdvice {

    public void beforeMethod() {
        System.out.println("Connection Check beforeMethod");
    }
}
