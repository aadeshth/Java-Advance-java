package com.core.test;

import java.util.Locale;

public class Student {
    public String name;
    public int age;


    public int calculateSum(int a, int b)
    {
        return a+b;
    }

    public String getName()
    {
        return name.toLowerCase(Locale.ROOT);
    }

     public void setName(String name)
     {
         this.name = name;
     }
    //gettter and setter methods

}
