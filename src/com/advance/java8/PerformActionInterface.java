package com.advance.java8;

public interface PerformActionInterface {
    int add(int a, int b);
    default void printData(){
        System.out.println("I am default method!");
    }
    static int getSum(int a , int b){
        return a+b;
    }
}
