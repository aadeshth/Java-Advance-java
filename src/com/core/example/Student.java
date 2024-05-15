package com.core.example;

import java.io.Serializable;

public class Student implements Serializable {
    transient String name = "Nikhil";
    int age = 23;
    int id =1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
