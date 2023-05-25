package com.bit.aop.test2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("calculator.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);
        System.out.println(calculator.add(10, 10));
        
		/*
		 * int result = calculator.add(5, 3); System.out.println("Result: " + result);
		 * 
		 * result = calculator.subtract(8, 4); System.out.println("Result: " + result);
		 */
        
        
        
    }
}