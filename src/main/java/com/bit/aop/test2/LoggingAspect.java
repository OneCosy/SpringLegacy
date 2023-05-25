package com.bit.aop.test2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
//    @Before("execution(* Calculator.*(..))")
//    public void beforeMethodExecution(JoinPoint joinPoint) {
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("Before executing " + methodName + "()");
//    }
//    
//    @After("execution(* Calculator.*(..))")
//    public void afterMethodExecution(JoinPoint joinPoint) {
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("After executing " + methodName + "()");
//    }
//    
//    @AfterReturning(pointcut = "execution(* Calculator.*(..))")
//    public void afterReturningMethodExecution(JoinPoint joinPoint) {
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("After returning from " + methodName);
//    } 
//    
//    @AfterThrowing(pointcut = "execution(* Calculator.*(..))", throwing = "exception")
//    public void afterThrowing(JoinPoint joinPoint, Exception exception) throws Exception {
//    	System.out.println("Exception 발생!!");
//    	
//    }
//    
	 @Around("execution(* Calculator.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
    	long start = System.currentTimeMillis();
    	try {
		 	Object a = joinPoint.proceed();
		} finally {
			long end = System.currentTimeMillis();
			long result = end-start;
			System.out.println("걸린시간: " + result);
			
		}
        
    
   }
}





