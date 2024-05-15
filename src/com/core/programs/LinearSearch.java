package com.core.programs;

public class LinearSearch {

    public static void main(String[] args) {
        int searchVal= 50;
        int array [] = {40,20,60,50,70,50};
        int valueExists = findValue(searchVal, array);  // =0;
        /*
         for (int i = 0; i< array.length; i++)
        {
            if(array[i] == searchVal) {
               valueExists = array[i];
            }
        }

         */

        if(valueExists!=0)
        System.out.println("Found value : "+ valueExists);
        else
            System.out.println("value not found!");
//
//        if(found)
//            System.out.println("Value exists in the given array!");
//        else
//            System.out.println("Value Not exists in the given array!");
    }

    private static int findValue(int searchVal, int[] array) {
        for (int i = 0; i< array.length; i++)
        {
            if(array[i] == searchVal) {
               return array[i];
            }
        }
        return 0;
    }
}
