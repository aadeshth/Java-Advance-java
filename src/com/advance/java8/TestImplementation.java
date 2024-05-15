package com.advance.java8;

public class TestImplementation implements PerformActionInterface{
    @Override
    public int add(int a, int b) {
        PerformActionInterface.super.printData();
        return PerformActionInterface.getSum(a,b);
    }
}
