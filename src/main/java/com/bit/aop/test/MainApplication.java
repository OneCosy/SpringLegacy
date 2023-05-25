package com.bit.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:logingTest.xml");

        UserService userService = (UserService) context.getBean("userServiceImp");

        userService.login("Han");
        System.out.println();
        userService.logout("Han");
    }
}
