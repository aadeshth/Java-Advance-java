package com.core.example.conditions;

public class Condition {

    public static void main(String[] args) {
        int number1 = 50;
        /*int number2 = 100;
        if(number1 == number2)
        {
            System.out.println("Value Matched second");
        }else if(number1 == 100)
        {
            System.out.println("Value Matched first");
        }else {
            System.out.println("Value not Matched!");
        }*/

/*        switch (number1)
        {
            case 10:
                printInfo(10);
                break;
            case 20:
                printInfo(20);
                break;
            case 30:
                printInfo(30);
                break;
            case 50:
                printInfo(50);
                break;
            case 60:
                printInfo(60);
                break;
            case 70:
                printInfo(70);
                break;
            default:
                printInfo(number1);
                break;
        }*/

        // Looping statements
        // For Loop
        // While Loop
        // For Loop
         // intialisation, condition, increment
       /* for (int number = 1; number<=10;number++)
        {
           if(number == 5)
              System.out.println("found 5");
           else
               printInfo(number);
        }*/
     /*   int [] array = {1,2,3,4,5};

        for(int i=0; i < array.length; i++)
        {
            printInfo(array[i]);
        }

        String[] strArray = {"Kiran","Apurva","Yogesh"};
        for(int i=0; i < strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }*/
/*
        int i = 0;
       // int [] array = {1,2,3,4,5};
        while(i<10){
            System.out.println(i);
            i++;
        }*/
        int i = 5;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
 /*
    number = 1 , 1<=10 = true
    prinfo(1) //print in loop 1
    number++ // number = 1 + 1 = 2

    number = 2, 2 <= 10 = true
     printinfo(2) //print in loop 2
    number++ // number = 2 + 1 = 3


  */
    private static void printInfo(int value){
        System.out.println("array value is  "+value);
    }
}
