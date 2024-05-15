package com.core.example.myjava;

public class TestEnum {
    static int number= 20;
public enum Season{
    WINTER,RAINY,SUMMER
}


    public static void main(String[] args) {
        System.out.println(number);
        Power power = Power.MEDIUM;
        System.out.println(power.name());
        Season[] seasons = Season.values();
        int i = 0;
        while (i < seasons.length)
        {
            System.out.println(seasons[i]);
            i++;
        }
       /* switch (power)
        {
            case LOW :
                System.out.println("Low power!");
                break;
            case MEDIUM:
                System.out.println("Medium power !");
            case STRONG:
                System.out.println("Strong power!");
            default:
                System.out.println("Not Found");
        }*/

//        System.out.println("Addition : "+ addition(10,10));
    }

    public void addition(int a, int b)
    {
        int result = a+b;

    }
}
