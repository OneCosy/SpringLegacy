package com.bit.test1;

public class CalcMul implements Calc {
    private int c;
    private int d;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public CalcMul() {
    }

    public CalcMul(int c, int d) {
        this.c = c;
        this.d = d;
    }

    @Override
    public int calculate() {
        return c*d;
    }

    @Override
    public String toString() {
        return c + " * " + d + " = " + calculate();
    }
}
