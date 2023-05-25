package com.bit.ex02.com.edu.main;

import com.bit.ex02.com.edu.entity.Rectangle;
import com.bit.ex02.com.edu.entity.Shape;
import com.bit.ex02.com.edu.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();

        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:bean.xml");
        Shape sh1 = (Shape) factory.getBean("rect");
        sh1.viewSize();

        Shape sh2 = (Shape) factory.getBean("tri");
        sh2.viewSize();
    }
}
