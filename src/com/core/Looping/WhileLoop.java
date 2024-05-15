package com.core.Looping;

public class WhileLoop {

    public static void main(String[] args) {
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }

        int j =5;
        do {
            System.out.println(j);
            j--;
        }while(1<=j);
    }


}
enum Data {
    START(1), STOP(2), RUNNING(3);

    int statusCode;
    Data(int i) {
        this.statusCode = i;
    }
}
