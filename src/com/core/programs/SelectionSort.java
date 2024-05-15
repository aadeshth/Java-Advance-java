package com.core.programs;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {10,50,2,40,55};
        for(int i = 0; i < arr.length; i ++)
        {
            int mIndex = i;
            for(int k = i+1; k<arr.length; k++)
            {
                if(arr[k]<arr[mIndex])
                    mIndex=k;
            }
            int temp = arr[i];    //temp = 10
            arr[i] = arr[mIndex]; // first =2 and second =2
            arr[mIndex] = temp; // second = 10 and first = 2
        }

        for (int i= 0; i< arr.length; i ++)
            System.out.println(arr[i]);
    }
}
