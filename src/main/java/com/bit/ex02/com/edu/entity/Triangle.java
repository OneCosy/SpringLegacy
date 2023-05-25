package com.bit.ex02.com.edu.entity;

import org.springframework.stereotype.Component;

@Component
public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(String title, int data1, int data2) {
        super(title, data1, data2);
    }

    @Override
    public void viewSize() {
        String title = getTitle();
        int data1 = getData1();
        int data2 = getData2();
        System.out.println(title + "의 넓이 : " + (data1*data2)/2);
    }
}
