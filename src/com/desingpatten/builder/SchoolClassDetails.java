package com.desingpatten.builder;

public class SchoolClassDetails {

    public static void main(String[] args) {
        School school = new School.Builder().setName("MIT").setAddress("Pune").setType("IT").build();
        System.out.println(school.getName());
    }
}
