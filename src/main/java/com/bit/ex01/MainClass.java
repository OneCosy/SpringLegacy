package com.bit.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
        Cats myCat = factory.getBean("myCats", Cats.class);
        myCat.getCatsInfo();
    }
}
