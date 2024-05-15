package com.advance.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3","4","5","6","7");
        System.out.println(list);

        List<Integer> listInt = list.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(listInt);

        List<Integer> finalList = listInt.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(finalList);

        List<String> names = Arrays.asList("PRASHANT","Dev","SUBODH","Nikhil");
         names.stream().map(String::toLowerCase).forEach(s-> System.out.println(s));

        // print length of each name
        names.stream().map(name->name.length()).forEach(s-> System.out.println(s));





    }
}
