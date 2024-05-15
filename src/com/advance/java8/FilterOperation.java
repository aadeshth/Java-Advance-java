package com.advance.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {

    public static void main(String[] args) {

        //Filter
        List<String> names = Arrays.asList("Prashant","Dev","Subodh","Nikhil");

        // print if not equals with Nikhil
        names.stream().filter(name -> !name.startsWith("Nikhil")).forEach(name-> System.out.println(name));

        // return list not equals with Nikhil
        List<String> filteredNames = names.stream().filter(name -> !name.equals("Nikhil")).collect(Collectors.toList());

        System.out.println(filteredNames);

        // return the count
        long count = names.stream().filter(name -> !name.equals("Nikhil")).count();

        System.out.println(count);

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //return a count of event number
        long countOfEven =numbers.stream().filter(number->number%2==0).count();
        System.out.println(countOfEven);
        //print all even number
        numbers.stream().filter(number->number%2==0).forEach(i-> System.out.println(i));

        //return a list of even number
        List<Integer> listOfEvenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(listOfEvenNumbers);

    }
}
