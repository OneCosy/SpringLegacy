package com.bit.aop.basic3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyAspect {

    @Before("execution(public void com.bit.aop.basic3.Search*.*(..))")
    public void dataAttributeSearch(JoinPoint jp) { // Before
        // What
        Signature signature = jp.getSignature();
        System.out.println("@BeforeAdvice");
        String methodName = (signature.getName());
        Date date = new Date();

        System.out.println(date);
        if (methodName.equals("fileSearch")) {
            System.out.println("fileSearch Before");
        }
        if (methodName.equals("xmlParsing")) {
            System.out.println("xmlParsing Before");
        }
        if (methodName.equals("domSaxSearch")) {
            System.out.println("domSaxSearch Before");
        }
    }

    @After("execution(public void com.bit.aop.basic3.Search*.*(..))")   // 정상 | 비정상
    public void afterSearchAdvice(JoinPoint jp) { // After
        // What
        Signature signature = jp.getSignature();
        System.out.println("@AfterAdvice");
    }

    @AfterReturning("execution(public void com.bit.aop.basic3.Search*.*(..))")  // 정상 종료
    public void afterReturningSearchAdvice(JoinPoint jp) { // AfterReturning
        // What
        Signature signature = jp.getSignature();
        System.out.println("@AfterReturning");
    }

    @AfterThrowing("execution(public void com.bit.aop.basic3.Search*.*(..))")   // Throwing
    public void afterThrowingSearchAdvice(JoinPoint jp) { // AfterThrowing
        // What
        Signature signature = jp.getSignature();
        System.out.println("@AfterThrowing");
    }

    @Around("execution(public void com.bit.aop.basic3.Search*.*(..))")
    public void AroundAdvice(ProceedingJoinPoint jp) {
        // ProceedingJoinPoint는 특정 시점에서 호출 또는 실행을 나타내는 클래스이다.
        // 보통 프록시 객체를 통해 제공되며 AOP에서 (ASPECT)를 적용할 수 있는 지점을 사용하고 조작하는데 사용
        System.out.println("Service AdviceBefore");
        Signature signature = jp.getSignature();
        try {
            jp.proceed();   // 관련된 핵심메소드 호출

            // 전달인자 반환
            for (Object o : jp.getArgs()) {
                System.out.println(o);
            }

            System.out.println("Target " + jp.getTarget()); // 대상 객체 반환
            System.out.println("SignatureMethodName: " + jp.getSignature().getName());
            System.out.println("SignatureTypeName: " + jp.getSignature().getDeclaringTypeName());
        } catch (Throwable e) { // 전달 인자 반환

        }
        System.out.println("Service Advice");
    }
}
