package com.core.Looping;

public class LoopingTest {
    public static void main(String[] args) {
        /*
         for loop
         while loop
         do while
         */
        // For loop
        // 1: initialization eg: int i =0 / int i = 1
        // 2: condition eg: i < 10 / i <=10 or i > 10 or i >= 10  return true or false
        // 3: body for a loop { .... }
        // 4: update expression - increment or decrement ,i=  --(-1) or ++(+1)

        // for(initialization; condition; update ) print()

        int [] intArray;
        intArray = new  int[5];
        int [] rr = {1,2,3,4,5};
        intArray[0] = 4;
        intArray[1] = 12;
        intArray[2] = 30;
        intArray[3] = 22;
        intArray[4] = 1;
//        for(int i = 0 ; i < 10 ; i++)
//        {
//            intArray[i] = i;
//        }

        for(int i = 5 ; i > rr.length  ; i--)
        {
            System.out.println(rr[i]);
            System.out.println();
        }

       // System.out.println();
//        int i = 1;
//        for(;;)
//        {
//            System.out.println(i);
//            if(i>=10) break;
//
//            i++;
//        }

    }
}
