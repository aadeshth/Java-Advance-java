package com.core.oops.abstraction.abstractclass;

public class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("I can say maao!");
        super.walk("asdf");
    }
}
