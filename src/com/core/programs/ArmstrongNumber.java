package com.core.programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 151;
        int temp = number;
        int length = 0;
        while(temp !=0 )
        {
            temp = temp/10;
            length = length+1;
        }
        System.out.println(length);
        int temp2;
        int rem;
        int sum =0;
        temp2 = number;
        while(temp2 != 0)
        {
            rem = temp2 % 10;
            int mult=1;
            for(int i = 1; i<= length; i++)
            {
                mult = mult*rem;
            }
            sum = sum + mult;
            temp2 = temp2/10;
        }

        if(sum == number)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Numbers is not Armstrong !");
    }
}
