package com.bit.aop.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SearchMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:search.xml");

        Search search = (Search) context.getBean("adminSearch");

        search.domSaxSearch();
//        search.fileSearch();
//        search.xmlParsing();

    }
}
