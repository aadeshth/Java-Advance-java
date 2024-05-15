package com.core.programs;

public class FobonacciSeries {
    public static void main(String[] args) {
        int numberOne=0, numberTwo=1;
        int length=10;
        for(int i=1; i<=length; i++)
        {
            System.out.println(numberOne+", ");
            int numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
    }
}
