package com.bit.aop.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UnitMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:unit.xml");

        Unit unit = (Unit) context.getBean("marine");
        unit.doCommand();
    }
}
