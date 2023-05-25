package com.bit.aop.basic1;

public class OracleDao implements Dao {
    @Override
    public void update(int x) {
        System.out.println("OracleDao Update");
    }

    @Override
    public void select() {
        System.out.println("OracleDao Select");
    }
}
