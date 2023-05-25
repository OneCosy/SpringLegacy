package com.bit.di.test;

public class CoffeeOrderService implements CoffeeDao {
    private Coffee coffee;

    public CoffeeOrderService(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void placeOrder() {
        System.out.println("주문한 커피 : " + coffee.getName());
        System.out.println("주문이 완료되었습니다.");
    }
}
