package com.advance.string;

public class StringExample {

    public static void main(String[] args) {
        String str = new String("data");
        System.out.println("str.charAt(1): "+str.charAt(1));
        System.out.println("str.length(): "+str.length());
        System.out.println(str.substring(str.length()-2));
        System.out.println(str.substring(2,4));
        String a = " sdf fds ";
        System.out.println(a);
        System.out.println(a.trim());
        System.out.println(a.compareTo(str));
        Student sd = new Student(1,"Code");


    }
}
