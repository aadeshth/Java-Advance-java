package com.core.myjava;

public abstract class JavaArray {

    abstract void getInfo();
    public static void main(String[] args) {
//        int[] numArray;
//        int[] numArrayWithVal = {1,2,3,4,5};
//        char[] charArray = {'A','P','U','R','V','A'};
//        String[] strArray = {"Apurva","Gaurav","Swapnil","Yogesh"};
//        System.out.println(strArray.length);
//        System.out.println(strArray[2]);

        int [][] numbers = new int[5][4];
        int [][] numVal = {
                {1,2,4,5},
                {6,7,8,9},
                {10,11,12,13}
        };
        System.out.println(numVal[0][1]);
    }
}
