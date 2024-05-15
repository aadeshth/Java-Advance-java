package com.core.programs;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        int temp, numberOne=10, numberTwo=20;
        // using Temp Variable
        temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;

        System.out.println("numberOne: "+numberOne);
        System.out.println("numberTwo: "+numberTwo);

        // Without third variable
        numberOne = numberOne+numberTwo;
        numberTwo = numberOne-numberTwo;
        numberOne = numberOne-numberTwo;

        System.out.println("numberOne: "+numberOne);
        System.out.println("numberTwo: "+numberTwo);

    }
}
