package com.bit.di.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerSystemMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:dbms.xml");
        ServerSystem serverSystem = (ServerSystem) applicationContext.getBean("serverSystem");

        System.out.println(serverSystem);
    }
}
