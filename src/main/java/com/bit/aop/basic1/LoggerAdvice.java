package com.bit.aop.basic1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAdvice {

    public void loggerProcess(ProceedingJoinPoint jp) {
        // ProceedingJoinPoint는 특정 시점에서 호출 또는 실행을 나타내는 클래스이다.
        // 보통 프록시 객체를 통해 제공되며 AOP에서 (ASPECT)를 적용할 수 있는 지점을 사용하고 조작하는데 사용
        try{
            if(jp.getSignature().getName().equals("update"))
                jp.proceed();   // 관련된 핵심 메소드 호출

            // 전달인자 반환
            for (Object o : jp.getArgs()) { // 전달 인자 반환
                System.out.println(o);
            }

            System.out.println("Target " + jp.getTarget()); // 대상 객체 반환
            System.out.println("SignatureMethodName: " + jp.getSignature().getName());
            System.out.println("SignatureTypeName: " + jp.getSignature().getDeclaringTypeName());
        } catch (Throwable e) {
            e.printStackTrace();
        }

        // 공통부분
        long start = System.currentTimeMillis();

        for (int i=0; i<(int)(Math.random()*100000); i++) {

        }

        long end = System.currentTimeMillis();

        System.out.println("time:  " + (end-start) + "" + (int)(Math.random()*10));
        System.out.println();
    }
}
