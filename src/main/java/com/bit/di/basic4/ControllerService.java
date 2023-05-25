package com.bit.di.basic4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ControllerService {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:service.xml");


        UserService service = (UserService) applicationContext.getBean("adminUserServiceImp");
        service.register();
    }
}
