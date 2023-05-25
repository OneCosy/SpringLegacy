package com.bit.test1;

public class CalcAdd implements Calc {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public CalcAdd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a+b;
    }

    @Override
    public String toString() {
        return a + " + " + b + " = " + calculate();
    }
}
