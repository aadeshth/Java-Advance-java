package com.advance.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Concurrency {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

//       for (String b:list
//             ) {
//            list.add(1,"test");
//        }
       CopyOnWriteArrayList<String> listC = new CopyOnWriteArrayList<>();
        listC.add("1");
        listC.add("2");
        for (String b:listC
        ) {
            listC.add("test");
        }
        System.out.println(listC);
       // ConcurrentHashMap
    }
}
