package com.advance.collection.map;

import java.util.*;

public class HashMapC {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nikhil",11111);
        map.put("Subodh",777777);
        map.put("Devendra",33333);
        map.put("Sarthak",22222);
        map.put("Sarthak1",22222);



        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
           Map.Entry element  = (Map.Entry) iterator.next();
           if(map.containsKey(element.getKey()))
            {
                System.out.println("Keyexists");
            }
            System.out.println("element.getKey() = "+element.getKey() +"  element.getValue(): "+element.getValue());
        }

        for(Map.Entry element : map.entrySet())
        {

            System.out.println("element.getKey() = "+element.getKey() +"  element.getValue(): "+element.getValue());
        }

    }
}
