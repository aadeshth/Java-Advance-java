package com.desingpatten;

public class Singleton {

    private static Singleton singleton;

    public static Singleton getInstance()
    {
        if(singleton != null)
        return new Singleton();
        else
            return singleton;
    }


}
