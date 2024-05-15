package com.core.oops.polymorphism.overriding;

public class OverridingTest {

    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.sound();
        Animal dog =  new Dog();
        dog.sound();
        Animal tiger = new Tiger();
        tiger.sound();

    }
}
