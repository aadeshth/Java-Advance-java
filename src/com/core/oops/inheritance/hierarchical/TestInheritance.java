package com.core.oops.inheritance.hierarchical;


public class TestInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Suraj");
        employee.setAddedDate("2024"); // from parent or super class
        System.out.println("Employee: "+employee.getName() +" "+ employee.getAddedDate());

        Student student = new Student();
        student.setName("Ravi");
        student.setAddedDate("2022");
        System.out.println("Student: "+ student.getName() +" "+ student.getAddedDate());
    }}
