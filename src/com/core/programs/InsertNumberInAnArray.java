package com.core.programs;

public class InsertNumberInAnArray {
    public static void main(String[] args) {
        int [] oldArray = {10,50,30,12,5,2};
        int length = oldArray.length+1;
        int [] newArray = new int[length];
        int position = 3;
        int value = 15;
        // int count of zeros
        // int newArray = new [oldArray/length-count] ;
        for(int i = 0 ;i < length; i++)
        {
            if(i< position-1) // oldArray[i] !=0
            {
                newArray[i]= oldArray[i];
            }else  if (i == position-1){
                newArray[i] = value;
            } else
                newArray[i]= oldArray[i-1];
        }
        for(int i = 0 ; i <newArray.length ; i ++)
            System.out.println(newArray[i]);

    }
}
