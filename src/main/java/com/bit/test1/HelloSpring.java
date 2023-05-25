package com.bit.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:bean.xml");

        Calc bean = (Calc) context.getBean("add");
        System.out.println(bean.toString());


        bean = context.getBean("mul", Calc.class);
        System.out.println(bean.toString());
    }
}
