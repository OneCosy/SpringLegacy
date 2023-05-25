package com.bit.aop.basic1;

public class AfterAdvice implements org.springframework.aop.AfterAdvice {

    // afterMethod() 다음에 실행되는 함수 (try)
    // 여기서 오류가 나면 after-throwing으로 던져줌
    public void afterReturningMethod() {
        System.out.println("Connection Release... AfterReturning");
    }

    // catch
    public void afterThrowing() {
        System.out.println("Connection Release... AfterThrowing");
    }

    // afterMethod() 무조건 실행 (마지막, final)
    public void afterMethod() {
        System.out.println("Connection Release... After");
    }


}
