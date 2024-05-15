package com.advance.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Sarthak");
        names.add("Subodh");
        names.add("Prashant");
        names.add(1,"Nikhil");
        names.set(1,"Devendra");
        names.addFirst("Aadi");
        names.addLast("Code");
        names.removeFirst();
        names.removeLast();
        for (String name: names) {
            System.out.println(name);
        }
    }
}
