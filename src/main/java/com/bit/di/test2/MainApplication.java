package com.bit.di.test2;

import com.bit.di.test.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // 스프링 컨텍스트 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        // UserService 인스턴스 얻기
        UserService userService = context.getBean(UserService.class);

        // 사용자 추가
        userService.addUser("Han");
    }
}
