package com.bit.ex01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {

    @Around("execution(public void com.bit.ex01.Cats*.*())")
    public void AroundAdvice(ProceedingJoinPoint jp) {
        System.out.println("이 동물의 정보는?");
        Signature signature = jp.getSignature();
        try {
            jp.proceed();   // 관련된 핵심메소드 호출
        } catch (Throwable e) { // 전달 인자 반환

        }
        System.out.println("이 동물의 정보 출력 완료");
    }

}
