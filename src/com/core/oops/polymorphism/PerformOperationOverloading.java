package com.core.oops.polymorphism;

public class PerformOperationOverloading {

    public void addition(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public int addition(int a, int b,int c)
    {
       return  a+b+c;
    }

    public double addition(){
        System.out.println("no Paramater");
        return 0.0;
    }

    public static void main(String[] args) {
        PerformOperationOverloading performOperation = new PerformOperationOverloading();
        System.out.println(performOperation.addition());
        performOperation.addition(10,10);
        System.out.println(performOperation.addition(10,20,30));
    }

}
