package com.bit.di.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 컨테이너
@Configuration
public class AppConfig {

    // Coffee 빈 생성
    @Bean
    public Coffee coffee() {
        return new Coffee("아메리카노");
    }

    // CoffeeOrderService 빈 생성
    @Bean
    public CoffeeOrderService coffeeOrderService(Coffee coffee) {
        return new CoffeeOrderService(coffee);  // Coffee 빈 의존성 주입
    }
}
