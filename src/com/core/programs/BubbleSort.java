package com.core.programs;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,50,2,40,55};
        for(int i = 0; i < arr.length; i ++) {
            for(int k=0;k<arr.length-1-i; k++)
            {
                if(arr[k]>arr[k+1])
                {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }

        for (int i= 0; i< arr.length; i ++)
            System.out.println(arr[i]);
    }
}
