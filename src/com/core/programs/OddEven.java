package com.core.programs;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println("input is : "+ number);
        if(number % 2 == 0)   // 5 % 2 = 5
        {
            System.out.println("Number is Even!");
        } else
        {
            System.out.println("Number is ODD!");
        }
    }
}
