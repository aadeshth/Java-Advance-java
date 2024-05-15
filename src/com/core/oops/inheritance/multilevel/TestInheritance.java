package com.core.oops.inheritance.multilevel;

public class TestInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(10); // this is from Grand parent
        employee.setAddedDate("2024"); // from parent or super class
        employee.setId(123); // from child or sub class
        System.out.println(employee.getId() +" "+ employee.getAddedDate());
    }
}
