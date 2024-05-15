package com.core.programs;

public class BinarySearch {

    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,60,70};
        int start=0;
        int end= array.length;
        int searchValue= 40;
        int arrayIndex = binarySearch(array, start, end,searchValue);
        System.out.println(arrayIndex + " = Found Value : "+ array[arrayIndex]);
    }

    private static int binarySearch(int[] array, int start, int end,int searchValue) {
        int indexVal= -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(array[mid] == searchValue) {
                indexVal = mid;
                break;
            }
            else if( array[mid] > searchValue)
                 end = mid-1;
            else
                start = mid+1;
        }
        return indexVal;
    }
}
