package com.bit.aop.basic1;

public class MySqlDao implements Dao {
    @Override
    public void update(int x) {
        System.out.println("MySqlDao Update");
    }

    @Override
    public void select() {
        String s = null;
        System.out.println(s.length());
    }
}
