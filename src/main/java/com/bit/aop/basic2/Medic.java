package com.bit.aop.basic2;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Medic implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        Marine marine = (Marine) target;    // target 객체를 의미

        if (marine.getCommand() instanceof CommandAttack) {
            System.out.println("Medic이 병사를 치료한다.");
        }
    }
}
