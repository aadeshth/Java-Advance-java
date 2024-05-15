package com.core.session;

public class ArrayTest {
    public static void main(String[] args) {
        int [] intArray;
        intArray = new  int[5];
        intArray[0] = 4;
        intArray[1] = 12;
        intArray[2] = 30;
        intArray[3] = 22;
        intArray[4] = 1;
        System.out.println(intArray[2]);

        // int [][] intArray;
        int twoDiArray [][];
        twoDiArray = new int [2][5];
        twoDiArray[0][0] = 4;
        twoDiArray[1][2] = 22;
        twoDiArray[0][4] = 1;
        twoDiArray[1][2] = 10;
        twoDiArray[0][2] = 30;
        twoDiArray[1][1] = 2;

        twoDiArray[0][0] = 4;
        twoDiArray[0][1] = 12;
        twoDiArray[0][2] = 30;
        twoDiArray[0][3] = 22;
        twoDiArray[0][4] = 1;

        twoDiArray[1][0] = 1;
        twoDiArray[1][1] = 2;
        twoDiArray[1][2] = 22;
        twoDiArray[1][3] = 1;
        twoDiArray[1][4] = 10;


    }
}
