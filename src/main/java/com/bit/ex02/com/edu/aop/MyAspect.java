package com.bit.ex02.com.edu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Around("execution(public void com.bit.ex02.com.edu.entity.*angle.*(..))")
    public void AroundAdvice(ProceedingJoinPoint jp) {
        System.out.println("도형의 넓이를 구한다.");
        Signature signature = jp.getSignature();
        try {
            jp.proceed();
        } catch (Throwable e) {

        }
        System.out.println("도형의 넓이를 구한다.");
    }

}
