package com.bit.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CoffeeOrderService coffeeOrderService = context.getBean(CoffeeOrderService.class);
        coffeeOrderService.placeOrder();
    }
}
