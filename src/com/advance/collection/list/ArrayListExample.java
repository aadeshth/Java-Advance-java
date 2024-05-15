package com.advance.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        names.add("Sarthak");
        names.add("Subodh");
        names.add("Prashant");
        System.out.println(names.get(1));
        names.set(1,"Devendra");
        System.out.println(names.get(1));
        names.remove(1);
        for (String name:names) {
            System.out.println(name);
        }
        System.out.println();
        //or
        for(int i=0; i<names.size();i++)
        {
            System.out.println(names.get(i));
        }

         names.clear();
        System.out.println("after clear");
        for (String name:names) {
            System.out.println(name);
        }


    }
}
