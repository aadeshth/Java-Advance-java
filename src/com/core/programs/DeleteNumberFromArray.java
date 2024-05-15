package com.core.programs;

public class DeleteNumberFromArray {
    public static void main(String[] args) {
        int array [] = {10,20,30,500,40,50,60};
        int deleteValue=500;
        int deleteValPosition = 0;

        for(int i = 0 ; i <array.length ; i ++)
            System.out.println(array[i]);
        System.out.println("After Deleting: ");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == deleteValue)
            {
                deleteValPosition = i;
            break;
            }
        }

        for(int i = deleteValPosition; i < array.length-1; i++)
        {
            array[i] = array[i+1];
        }
        for(int i = 0 ; i <array.length-1 ; i ++)
            System.out.println(array[i]);

    }
}
