package com.test.Service;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberSumUsingStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
         list.stream().filter(integer -> integer%2==0).mapToInt(Integer::intValue).sum();
    }
}
