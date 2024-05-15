package com.core.oops.abstraction.inteface;

public class Cat implements Animal {


    @Override
    public void sound() {
        System.out.println("I can say maao!");
    }

    @Override
    public void walk(String walkType) {
        System.out.println("i can walk "+walkType);
    }
}
