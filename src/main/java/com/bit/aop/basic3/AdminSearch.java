package com.bit.aop.basic3;

import org.springframework.stereotype.Component;

@Component
public class AdminSearch implements Search {
    @Override
    public void fileSearch() {  // 핵심코드
        System.out.println("fileSearch");
    }

    @Override
    public void xmlParsing() {
        System.out.println("xmlParsing");
    }

    @Override
    public void domSaxSearch() {
        System.out.println("domSaxSearch");

//        int rs = 10/0;
    }
}
