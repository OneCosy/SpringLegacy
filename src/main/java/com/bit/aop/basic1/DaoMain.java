package com.bit.aop.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DaoMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:dao.xml");
        Dao dao = (Dao) context.getBean("oracleDao");
        Dao dao2 = (Dao) context.getBean("mysqlDao");

        dao.select();
        dao2.update(10);
//
//        System.out.println();
//
//        dao2.select();

    }
}
