package com.advance.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;

public class ExceptionHandling {

    public static void main(String[] args) {
//        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
//        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(new String(""));
//        int arr [] = {1,2};
//         for(int i = 0 ; i <=10; i++)
//         {
//             System.out.println(arr[i]);
//         }
        try {
            perform();
        }catch (Exception e)
        {

            System.out.println(e.getMessage());
        }

    }

    private static void perform() throws Exception {
        Data data = new Data();

        if(data.getName() != null || !data.getName().isEmpty())
        System.out.println(data.getName().length());
        else
            throw new Exception("Name should not be empty or null!");

        int arr[] = {1, 2};
        for (int i = 0; i <= 1; i++) {
            System.out.println(arr[i]);
        }
    }


}
