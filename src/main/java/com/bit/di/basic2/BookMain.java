package com.bit.di.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:book.xml");

        BookStore bookStore = (BookStore) applicationContext.getBean("bookStore");
        System.out.println(bookStore);
    }
}
