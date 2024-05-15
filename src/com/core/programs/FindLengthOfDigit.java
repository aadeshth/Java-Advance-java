package com.core.programs;

public class FindLengthOfDigit {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int length = 0;
        while(temp !=0 )
        {
            temp = temp/10;
            length = length+1;
        }
        System.out.println(length);
    }
}
