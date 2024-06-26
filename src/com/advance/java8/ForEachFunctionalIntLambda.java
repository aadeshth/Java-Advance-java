package com.advance.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachFunctionalIntLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prashant","Dev","Subodh");
        names.forEach(name-> System.out.println(name));
        PerformAction pf = (i, j) -> i-j;
        System.out.println((pf.add(10,20)));
        PerformAction pf1 = (i, j) -> i+j;
        System.out.println((pf1.add(30,20)));
        PerformActionNew pf3 = (a, b) -> System.out.printf(a+" "+b);
        pf3.add(20,20);

    }
}
