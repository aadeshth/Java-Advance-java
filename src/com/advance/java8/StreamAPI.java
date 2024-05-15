package com.advance.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> data = ids.stream().map(i -> i + i).collect(Collectors.toList());
        System.out.println(data);
        List<String> names = Arrays.asList("Prashant","Dev","Subodh");
        boolean ifMatchExist = names.stream().anyMatch((name) -> name.startsWith("S"));
        System.out.println(ifMatchExist);







    }
}
